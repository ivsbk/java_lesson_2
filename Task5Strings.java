package com.company;

import java.util.Scanner;

public class Task5Strings {
    public static void main(String[] args) {

        int i, seedLength;
        String seed, nextSeed, linePow;
        boolean rootCheck = true;
        final int maxLength = 1023;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку до 100 символов");
        String sourceLine = scanner.nextLine();
        String line = sourceLine.toLowerCase();

        System.out.println("Введите число меньше 100001. Положительное возведёт строку в степень, отрицательное — вычислит корень.");
        int pow = scanner.nextInt();

        scanner.close();

        if (pow > 0) {
            linePow = line.repeat(pow);
            if (linePow.length() > maxLength) System.out.print(linePow.substring(0,maxLength - 1));
            else System.out.print(linePow);

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
            else {
                if (seed.length() > maxLength) System.out.print(seed.substring(0,maxLength - 1));
                else System.out.print(seed);
            }

        } else if (Math.abs(pow) > line.length() && pow < 0) {
           System.out.println("Корень невычислим");
            } else System.out.println("Такая степень не подойдёт!");
        }
    }

