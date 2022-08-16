package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1Bulls {


    public static void main(String[] args) {
        int[] userNum, masterNum;
        int i, j, length;
        int cows, bulls = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Со скольки разрядами загадать число? Цифры повторяться не будут.");
        length = sc.nextInt();

        userNum = new int[length];
        masterNum = numGen(length);

        //Предлагаем игроку отгадывать, пока все цифры не будут «быками»
        while (bulls !=length) {
            bulls = 0;
            cows = 0;
            System.out.println("Угадывайте число!");
            String input = sc.next();

            for (i = 0; i < length; i++) {
                userNum[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            for (i = 0; i < length; i++) {
                for (j = 0; j < length; j++) {
                    if (userNum[i] == masterNum[j] && i == j) bulls++;
                    else if (userNum[i] == masterNum[j] && i != j) cows++;
                    }
                }
            System.out.println("В вашем числе " + cows + " коров и " + bulls + " быков");
            }

            System.out.println("ВЫ ПОДЕБИЛИ!");
        }

       //Метод агадывает число, цифры в котором не повторяются
        public static int[] numGen(int length) {

            int[] masterNum = new int[length];
            Random rnd = new Random();

            for (int i = 0; i < length; i++) {
                masterNum[i] = rnd.nextInt(9);
                if (masterNum[0] == 0) i--;
                for (int j = 0; j < i; j++) {
                    if (masterNum[i] == masterNum[j]) {
                        i--;
                        break;
                    }
                }
            }
            return masterNum;
        }
    }
