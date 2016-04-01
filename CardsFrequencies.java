package com.company;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] cardsFaceSuit = input.nextLine().split(" ");

        LinkedHashMap<String, Integer> cards = new LinkedHashMap<>();
        for (String card : cardsFaceSuit) {
            String firstFace = card.substring(0,card.length()-1);
            cards.putIfAbsent(firstFace,0);
            cards.put(firstFace, cards.get(firstFace)+1);
        }
        for (Map.Entry<String,Integer>entry: cards.entrySet()) {
            String face = entry.getKey();
            double percent = entry.getValue()/(double)cardsFaceSuit.length;
            System.out.printf("%s -> %.2f", face, percent*100);
            System.out.println();
        }
    }
}
