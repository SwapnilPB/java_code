package java8;

import java.util.Arrays;

public class FindTriplet {
    public static void main(String[] args) {
        int a[] = {1, 3, 0, 4, 5};
        System.out.println("triplet : " + Arrays.toString(findTriplet(a)));
    }

    static int[] findTriplet(int[] a) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        int b[] = new int[3];
        for (int n : a) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else if (n <= third ) {
                third = n;
            }
        }
        b = new int[]{first, second, third};

        return b;
    }
}
