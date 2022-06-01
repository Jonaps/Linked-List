package com.mycompany.prime;

public class Prime {
    
    public static boolean isPrime(long n) {
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        for(long i = 2; i < Long.MAX_VALUE; i++) {
            System.out.println(i + " " + isPrime(i));7
        }
    }
}
