package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] word1 = input.nextLine().split(" ");
        String [] word2 = input.nextLine().split(" ");

        ArrayList<Character> firstWord = new ArrayList<Character>();
        ArrayList<Character> secondWord = new ArrayList<Character>();

        for (int i = 0; i < word1.length; i++) {
            String one = word1[i];
            firstWord.add(one.charAt(0));
        }
        secondWord.addAll(firstWord);
        for (int i = 0; i < word2.length; i++) {
            String two = word2[i];
            if (!firstWord.contains(two.charAt(0))){
                secondWord.add(secondWord.size(), two.charAt(0));
            }
        }
        System.out.println();
        for (int i = 0; i < secondWord.size(); i++) {
            System.out.print(secondWord.get(i)+ " ");
        }
    }
}
