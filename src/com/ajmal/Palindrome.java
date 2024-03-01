package com.ajmal;

class Palindrome {

    public boolean checkPalindrome(String strToCheckPallindrome) {
        if (strToCheckPallindrome == null || strToCheckPallindrome.length() < 1) {
            return false;
        }
        char[] stringArr = strToCheckPallindrome.toCharArray();
        int endIndex = strToCheckPallindrome.length() - 1;
        for (int i = 0; i <= endIndex; i++) {
            if (stringArr[i] != stringArr[endIndex]) {
                return false;
            }
            endIndex--;
        }
        return true;
    }
}