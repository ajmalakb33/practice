package com.ajmal;

import java.util.ArrayList;
import java.util.List;

public class TestCommaSeparated {

    public static void main(String args[]) {
        CommaSeparated commaSeparated = new CommaSeparated();
        List<Integer> integerList = new ArrayList<>();
        System.out.println(commaSeparated.getCommaSeperatedString(integerList));
        for (int i = 0; i < 25; i++) {
            integerList.add(i);
        }
        System.out.println(commaSeparated.getCommaSeperatedString(integerList));
        System.out.println(commaSeparated.getCommaSeperatedString(null));
    }
}
