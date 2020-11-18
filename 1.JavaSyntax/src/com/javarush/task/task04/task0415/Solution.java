package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int A = Integer.parseInt(sA);
        int B = Integer.parseInt(sB);
        int C = Integer.parseInt(sC);

        if (((A + B) > C) && ((A + C) > B) && ((B + C) > A)) {
            System.out.println("Треугольник существует.");
        } else System.out.println("Треугольник не существует.");
    }
}