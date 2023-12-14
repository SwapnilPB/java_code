package com.swap.java;

import java.util.Arrays;

public class ArrayMultiply {

    public static void main(String[] args) {
        ArrayMultiply a = new ArrayMultiply();
        int[] arr = a.mutiplyArray(new int[]{1, 2, 4, 3});
        System.out.println("output - " + Arrays.toString(arr));
    }

    int[] mutiplyArray(int input[]) {
        int[] res = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int[] latest = Arrays.copyOf(input, input.length);
            latest[i] = 1;
            int product = 1;
            for (int j = 0; j < input.length; j++) {
                product = product * latest[j];
                res[i] = product;
            }
        }

        return res;
    }
}
