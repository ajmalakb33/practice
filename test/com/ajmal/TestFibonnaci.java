package com.ajmal;

public class TestFibonnaci {

    public static void main(String args[]) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNthFinonacciNumber(0));
        System.out.println(fibonacci.getNthFinonacciNumber(1));
        System.out.println(fibonacci.getNthFinonacciNumber(10));
        System.out.println(fibonacci.getNthFinonacciNumber(6));
    }
}
