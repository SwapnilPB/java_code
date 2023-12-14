package com.swap.java;

public class Reverse {

    public static void main(String[] args) {
        int rev = reverserNumber(102);
        String revS = reverserString("102");
        System.out.println(rev);
        System.out.println(revS);
    }

    private static String reverserString(String ss) {
        StringBuilder sb = new StringBuilder();
        for (int i = ss.length() - 1; i >= 0; i--) {
            sb.append(ss.charAt(i));
        }
        return sb.toString();
    }

    static int reverserNumber(int a) {
        int num = 0;
        while (a > 0) {
            int b = a % 10;
            a = a / 10;
            num = (num * 10) + b;
        }

        return num;
    }
}
