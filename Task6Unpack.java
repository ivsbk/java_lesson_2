package com.company;

import java.util.Scanner;

public class Task6Unpack {
    public static void main (String[] args) {
        final int lettersInLine = 40;
        int k;

        Scanner scanner = new Scanner(System.in);
        String sourceLine = scanner.nextLine();
        String line = sourceLine.toUpperCase();
        int howLong =  line.length();
        String[] letters = new String[howLong];

        for (int i = 0; i < howLong; i++ ) {
            letters[i] = line.substring(i, i + 1);
        }

       StringBuffer buffer = Unpacking(letters, howLong);

        for (k = 0; k < buffer.length() / lettersInLine; k++ )
            System.out.println(buffer.substring(k * lettersInLine, (k+1) * lettersInLine));
        System.out.println(buffer.substring(k * lettersInLine));
    }

    public static StringBuffer Unpacking(String[] letters, int howLong){
        StringBuffer buffer = new StringBuffer();
        StringBuffer numBuf = new StringBuffer();
        boolean isNumber = false;

        for (int i = 0; i < howLong; i++ ) {
            try {
                Integer.parseInt(letters[i]);
                isNumber = true;
                numBuf.append(letters[i]);
            } catch (NumberFormatException e) {
                if (isNumber == true) {
                    buffer.append(letters[i].repeat(Integer.parseInt(numBuf.toString())));
                    numBuf.setLength(0);
                    isNumber = false;

                } else {
                    buffer.append(letters[i]);
                    isNumber = false;
                }
            }
        }
        return buffer;
    }
}
