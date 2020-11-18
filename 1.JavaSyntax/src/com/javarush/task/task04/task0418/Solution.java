package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string_number1 = reader.readLine();
        int number1 = Integer.parseInt(string_number1);

        String string_number2 = reader.readLine();
        int number2 = Integer.parseInt(string_number2);


        int max = maxnumber(number1, number2);

        System.out.println(max);
    }

    static int maxnumber(int x, int y) {
        if (x <= y) return x;
        else return y;
    }
}
