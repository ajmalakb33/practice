package com.ajmal.datastructures.map;

import java.util.HashMap;

public class HashMapImpl {

    public static Integer INT_ONE = 1;

    public static void main(String[] args) {
        Integer int_two = 2;
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(INT_ONE, "1");
        hashMap.put(int_two, "2");

        INT_ONE = 4;
        System.out.println(hashMap.get(INT_ONE));
        System.out.println(hashMap.get(int_two));
        System.out.println(hashMap.get(1));


    }
}
