package com.company;

import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] numbers = input.nextLine().split(" ");
        int[] digits = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {         //Prevryshtane na stringove v intove
            digits[i] = Integer.parseInt(numbers[i]);
        }
        int count = 0;
        int countNumbers = 1;
        int indexNumber = 0;
       System.out.print(digits[0] + " ");                //Pokazwane na pyrvoto chislo ot poredicata ot chisla
        for (int i = 1; i < digits.length; i++) {        //Pokazwane na redicata po golemina na chislata
            if (digits[i] > digits[i - 1]) {
                System.out.print(digits[i-1] + " ");
                countNumbers++;
            } else {
                System.out.println();
                System.out.print(digits[i] + " ");
                countNumbers = 1;
            }
            if (countNumbers > count) {
                count = countNumbers;
                indexNumber = i;
            }
        }
        System.out.println();
        System.out.print("Longest: ");
        int index = (indexNumber - (count - 1)); //Pokazwane na nai golqmata redica poredni chisla
        if(count > 1){
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[index] + " ");
                index++;
            }
        }else{
            System.out.print(numbers[0]);
        }

    }
}
