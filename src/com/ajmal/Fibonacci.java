package com.ajmal;

class Fibonacci {
    public int getNthFinonacciNumber(int sequenceNumber) {
        int fibonacciNamers[] = new int[sequenceNumber + 1];
        int i;
        fibonacciNamers[0] = 0;

        if (sequenceNumber > 0) {
            fibonacciNamers[1] = 1;
            for (i = 2; i <= sequenceNumber; i++) {
                fibonacciNamers[i] = fibonacciNamers[i - 1] + fibonacciNamers[i - 2];
            }
        }

        return fibonacciNamers[sequenceNumber];
    }

}