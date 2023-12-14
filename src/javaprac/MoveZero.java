package javaprac;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        System.out.println("new array : " + Arrays.toString(moveZeroToEnd(new int[]{0, 2, 0, 5, 6})));
    }

    public static int[] moveZeroToEnd(int[] nums) {
        int curr = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[curr++] = num;
            }
        }
        while (curr < nums.length) {
            nums[curr++] = 0;
        }
        return nums;
    }
}
