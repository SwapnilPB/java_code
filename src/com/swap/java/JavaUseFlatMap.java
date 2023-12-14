package com.swap.java;

import java.util.HashSet;
import java.util.Set;

public class JavaUseFlatMap {
    public static void main(String[] args) {
        System.out.println(JavaUseFlatMap.intersect(new int[]{1,5,3,9},new int[]{ 1,5,5,3}));
    }

    static Set<String> intersect(String[] ar) {
        String arr1 = ar[0];
        String arr2 = ar[1];

        String[] chAr1 = arr1.split(",");
        String[] chAr2 = arr2.split(",");
        Set<String> resArr = new HashSet<>();

        for (int i = 0; i < chAr1.length; i++) {
            for (int j = 0; j < chAr2.length; j++) {
                if (chAr1[i].equals(chAr2[j])) {
                    resArr.add(chAr2[j]);
                }
            }
        }
        return resArr;
    }

    static Set<Integer> intersect(int a[], int [] b) {

        Set<Integer> resArr = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i]==(b[j])) {
                    resArr.add(a[i]);
                }
            }
        }
        return resArr;
    }

}
