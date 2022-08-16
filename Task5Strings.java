package com.company;

import java.util.Scanner;

public class Task5Strings {
    public static void main(String[] args) {
        int i, seedLength;
        String seed, nextSeed;
        boolean rootCheck = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String sourceLine = scanner.nextLine();
        String line = sourceLine.toLowerCase();

        System.out.println("Введите число. Положительное возведёт строку в степень, отрицательное — вычислит корень.");
        int pow = scanner.nextInt();

        scanner.close();

        if (pow > 0) {
            for (i = 1; i <= pow; i++) System.out.print(line);
        } else if (pow < 0) {
            seedLength = line.length() / Math.abs(pow);
            seed = line.substring(0,seedLength);

           for (i = 0; i < Math.abs(pow); i++ ){
               nextSeed = line.substring(seedLength * i,seedLength * (i + 1));
               if (!seed.equals(nextSeed)) {
                   rootCheck = false;
               }
           }
            if (rootCheck == false) System.out.println("Корень невычислим");
            else System.out.println(seed);

        } else if (Math.abs(pow) > line.length() && pow < 0) {
           System.out.println("Корень невычислим");
            } else System.out.println("Такая степень не подойдёт!");
        }
    }

