package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {


    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber1 = Integer.parseInt(bufferedReader.readLine());
        if(inputNumber1 <= 0) throw new NumberFormatException();
        int inputNumber2 = Integer.parseInt(bufferedReader.readLine());
        if(inputNumber2 <= 0) throw new NumberFormatException();

        int x = commonDevider(inputNumber1, inputNumber2);
        System.out.println(x);

    }


    static public int commonDevider(int a, int b) {

        while (a != 0 && b != 0) {


            if (a > b) {
                a = a % b;

            } else {
                b = b % a;

            }

        }

        return a + b;
    }
}
