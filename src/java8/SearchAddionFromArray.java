package java8;

import java.util.Arrays;

public class SearchAddionFromArray {
    public static void main(String[] args) {
        System.out.println("two sum array is : " + Arrays.toString(twoSum(new int[]{1, 3, 4, 6, 7, 8, 10}, 10)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i <= j) {
            if ((numbers[i] + numbers[j]) == target) {
                return new int[]{i+1,j+1};
            } else if ((numbers[i] + numbers[j]) < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{0,0};
    }
}
