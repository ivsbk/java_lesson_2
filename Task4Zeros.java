package com.company;

import java.util.Scanner;

public class Task4Zeros {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("C вас - строка с нулями и единицами:");
        String line = sc.nextLine();

        int zeroRecord = 0;
        int zeroConsecutive = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '0') zeroConsecutive++;
            else if(zeroRecord < zeroConsecutive) {
                zeroRecord = zeroConsecutive;
                zeroConsecutive = 0;
            } else zeroConsecutive = 0;

                }
        System.out.println(zeroRecord);
            }
        }