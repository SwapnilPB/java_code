package java8;

import java.util.Arrays;

public class RemoveArrayDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 2, 1, 3};
       // int j = 0;
        int[] b = new int[a.length];
        for (int i = 0, j=0; i < a.length-1; i++) {
            if (a[i] != a[i + 1]) {
                b[j++] = a[i];
            }

        }

        System.out.println(Arrays.toString(b));
    }
}
