package com.javaelementary;

import java.math.BigInteger;

public class Task1 {

    /*
    1) Число Фибоначи
    написать метод который возвращает N-ное число фибоначи, по правилу:
    F(0) = 0, F(1) = 1
    F(N) = F(N - 1) + F(N - 2)
    */

    public static void main(String[] args) {
        System.out.println(miniFibonacci(92));
        System.out.println(fibonacci(92));
    }

    /**
     * Return the nth Fibonacci number in the range from 0 to 92
     *
     * @param n - the nth Fibonacci number
     * @return Fibonacci number 0...92, if n > 92 - return -1
     */
    private static long miniFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n > 92) {
            return -1;
        }
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    /**
     * Return the nth Fibonacci number
     *
     * @param n - the nth Fibonacci number
     * @return BigInteger Fibonacci number
     */
    private static BigInteger fibonacci(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger[] f = new BigInteger[n+1];
        f[0] = BigInteger.valueOf(0);
        f[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; ++i) {
            f[i] = f[i - 1].add(f[i - 2]);
        }
        return f[n];
    }
}