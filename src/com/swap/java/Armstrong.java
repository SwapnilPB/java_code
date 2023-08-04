package com.swap.java;

public class Armstrong {
    static boolean isArmstrongUsingString(long a) {
        String con = String.valueOf(a);
        long newA = 0;
        char[] arr = con.toCharArray();
        for (char i : arr) {
            int intToChar = Integer.parseInt(String.valueOf(i));
            newA += intToChar * intToChar * intToChar;
        }
        return a == newA;
    }

    static boolean isArmstrongUsingRem(long a) {
        //System.out.println("num : "+a);
        long orgValue = a;
        long sum = 0;
        while (a > 0) {
            long rem = a % 10;
            a = a / 10;
            sum = sum + (rem * rem * rem);
        }
        if (orgValue == sum) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.print("Armstrong numbers are  : ");
        for (int i = 100; i <= 1000; i++) {
            if (isArmstrongUsingRem(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
