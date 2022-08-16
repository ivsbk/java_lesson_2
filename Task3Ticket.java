package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3Ticket {
    public static void main (String[] args){
        int number, numberCount, count = 0, number1 = 0, number2 = 0, sum1, sum2;
        Scanner sc = new Scanner(System.in);

            System.out.println("Введите номер билета:");
            try {
            number = sc.nextInt();
            numberCount = number;

                while (numberCount != 0) {
                    numberCount /= 10;
                    ++count;
                }

                if (count % 2 != 0) {
                    System.out.print("Неподходящий номер, нужно чётное количество цифр.");
                }
                //Считаем сумму первой половины цифр
                for (int i = 1; i <= count / 2; i++){
                    number1+= (number % Math.pow(10, i)) / Math.pow(10, i-1);
                }
                //Считаем сумму второй половины цифр
                for (int i = (count / 2 ) + 1; i <= count; i++){
                    number2+= (number % Math.pow(10, i)) / Math.pow(10, i-1);
                }

                if (number1 == number2) {
                    System.out.println("Счастливый!");
                } else {
                    System.out.println("Не счастливый. Повезёт в другой раз.");
                }

            }
            catch (InputMismatchException e) {
                System.out.print("Неподходящий номер, работает только с цифрами.");
            }
        }

    }

