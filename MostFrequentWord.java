package com.company;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] words = input.nextLine().toLowerCase().split("\\W+");

        TreeMap<String, Integer> countWords = new TreeMap<>();
        for (String word : words) {
            if (word.length() < 2) {
                continue;
            }
            Integer currentCount = countWords.get(word);
            countWords.put(word, (currentCount == null ? 1 : (currentCount + 1)));
        }
        Set<Map.Entry<String, Integer>> currentCountSet = countWords.entrySet();
            for (Map.Entry<String, Integer> entry : currentCountSet) {
                if (entry.getValue() > 1){
                    System.out.println(entry.getKey()+ " -> " + entry.getValue()+" times" );
                }
            }

    }
}
