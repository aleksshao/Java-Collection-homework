package com.company;

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] enterWords = input.nextLine().split(" ");
        int count = 1;
        int maxCount = 1;
        int index  = 0;
        for (int i = 1; i < enterWords.length; i++) {
            if (enterWords[i].equals(enterWords[i - 1])) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    index = i;
                }
            } else {
                count = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(" "+enterWords[index]);
        }
    }
}
