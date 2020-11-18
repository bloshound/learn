package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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

        String string_number3 = reader.readLine();
        int number3 = Integer.parseInt(string_number3);

        String string_number4 = reader.readLine();
        int number4 = Integer.parseInt(string_number4);

        int max = maxnumber(number1, number2, number3, number4);

        System.out.println(max);
    }

   static int maxnumber(int x, int y, int z, int u) {
        if ((x >= y) && (x >= z) && (x >= u)) return x;
        if ((y >= x) && (y >= z) && (y >= u)) return y;
        if ((z >= x) && (z >= y) && (z >= u)) return z;
        if ((u >= x) && (u >= y) && (u >= z)) return u;
        return 0;

    }
}



