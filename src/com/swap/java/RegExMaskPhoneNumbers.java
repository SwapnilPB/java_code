package com.swap.java;

public class RegExMaskPhoneNumbers {

    public static void main(String[] args) {

        String[] strPhoneNumbers = {
                "12344",
                "0123456789",
                "6528680000034008"
        };

        String strPattern = "\\d(?=\\d{2})";

        for(String phoneNumber : strPhoneNumbers) {
            System.out.println( phoneNumber.replaceAll(strPattern, "X") );
        }
    }
}