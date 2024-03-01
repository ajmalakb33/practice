package com.ajmal;

import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

    private static final String COMMA_SEPARATOR = ",";
    private static final String EMPTY_STRING = "";

    public String getCommaSeperatedString(List<Integer> integerList) {
        if (integerList == null || integerList.size() == 0) {
            return EMPTY_STRING;
        }
        return integerList.stream().map(x -> {
                    String y = "";
                    if (x % 2 == 0) {
                        y = "e" + x;
                    } else {
                        y = "o" + x;
                    }
                    return y;
                }
        ).collect(Collectors.joining(COMMA_SEPARATOR));

    }
}
