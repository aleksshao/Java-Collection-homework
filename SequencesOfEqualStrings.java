package com.company;

import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] enterWords = input.nextLine().split(" ");

        for(int i = 0;i < enterWords.length - 1;i++){
            String word1 = enterWords[i];
            String word2 = enterWords[i+1];

            if(word1.equals(word2)){
                System.out.print(word1 + " ");
            }else{
                System.out.println(word1);
            }
        }
        String words1 = enterWords[enterWords.length-2];
        String words2 = enterWords[enterWords.length-1];
        if(words1.equals(words2)){
            System.out.print(words2);
        }else{
            System.out.println(words2);
        }
    }
}
