package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split("\\W+");
        String word = input.nextLine().toLowerCase();
        int countOfWords = 0;
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i])){
                countOfWords++;
            }
        }
        System.out.println(countOfWords);

    }
}
