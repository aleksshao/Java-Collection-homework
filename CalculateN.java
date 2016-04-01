package com.company;


import java.util.Scanner;

public class CalculateN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        long factorial = calculation(number);
        System.out.println(factorial);
    }
    public static long calculation(long n){
        long factorialnumbers = 1;
        while(n > 0){
            factorialnumbers = factorialnumbers * n--;
        }
        return factorialnumbers;
    }
}
