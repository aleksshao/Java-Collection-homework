package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();

        int [] numbers = new int[range];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = input.nextInt();
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(" " +number);
        }

    }
}
