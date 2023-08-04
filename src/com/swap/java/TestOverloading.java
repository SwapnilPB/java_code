package com.swap.java;

public class TestOverloading {
    public static void main(String[] args) {
        System.out.println("ABC");
    }
// if wanted to method overloading then parameter type or parameter list must be different
    void fun(int... a) {
        System.out.println(a);
    }

    protected void fun(String a) throws Error {
        System.out.println(a);
    }
}
