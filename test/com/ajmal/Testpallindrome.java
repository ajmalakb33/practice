package com.ajmal;

public class Testpallindrome {

    public static void main(String args[]){
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.checkPalindrome("1"));
        System.out.println(palindrome.checkPalindrome("asdf"));
        System.out.println(palindrome.checkPalindrome("assa"));
        System.out.println(palindrome.checkPalindrome("asbsa"));

    }
}
