package com.swap.java;

public class TestOverriding extends TestOverloading {
    @Override
    protected void fun(String a) {/*if wanted to override methods from base class
         then access privilege should be same or more than the base method for example
         if in base class privilege is default then we need to define as default or public */
        System.out.println("in Overriding");
    }

    public static void main(String[] args) {
        System.out.println("ABC");
        TestOverloading to = new TestOverriding();
       //try {
            to.fun("agsja");
        //} catch (Throwable t) {

        //}
    }
}
