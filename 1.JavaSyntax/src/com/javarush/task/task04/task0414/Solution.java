package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_year = reader.readLine();
        int year = Integer.parseInt(s_year);
        int days_short_year = 365;
        int days_long_year = 366;

        if (year % 400 == 0) {
            System.out.println("количество дней в году: " + days_long_year);
        } else {
            if (year % 100 == 0) {
                System.out.println("количество дней в году: " + days_short_year);

            }
        }
    }
}