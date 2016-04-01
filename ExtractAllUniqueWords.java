package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] text = input.nextLine().toLowerCase().split("\\W+");
        Set<String> finalText = new TreeSet<String>();

        for (int i = 0; i < text.length; i++) {
            finalText.add(text[i]);
        }
        Arrays.sort(text);
        finalText.stream().forEach(n -> System.out.print(n+ " "));
    }
}
