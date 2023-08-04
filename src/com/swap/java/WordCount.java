package com.swap.java;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String a = "bsdbsbb";

        Map<String, Integer> m = new HashMap<>();
        Date start = new Date();
        System.out.println("start time : " + start);
        for (int i = 0; i < a.length(); i++) {
            if (m.containsKey(String.valueOf(a.charAt(i)))) {
                m.put(String.valueOf(a.charAt(i)), m.get(String.valueOf(a.charAt(i))) + 1);
            } else {
                m.put(String.valueOf(a.charAt(i)), 1);
            }
        }
        m.forEach((k, v) -> System.out.println(k + "=" + v));
        Date end = new Date();
        System.out.println("end time : " + end);
        long timeEx = end.getTime() - start.getTime();
        System.out.println("time to execute : " + timeEx);
    }
}
