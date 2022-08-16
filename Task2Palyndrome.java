package com.company;

import java.util.Scanner;

public class Task2Palyndrome {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String initialWord, word, drow;
        int i;

        StringBuffer sb = new StringBuffer();
        initialWord = sc.nextLine();
        word =  initialWord.replaceAll("\\s+", "");
        word = word.toLowerCase();

        sb.append(word);
        sb.reverse();
        drow = sb.toString();

        if (word.equals(drow)) System.out.println(initialWord + " -- это палиндром");
        else System.out.println(initialWord +" -- это не палиндром");
    }
}
