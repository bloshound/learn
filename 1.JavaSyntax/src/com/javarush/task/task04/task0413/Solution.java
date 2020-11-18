package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string_day_number = reader.readLine();
        int day_number = Integer.parseInt(string_day_number);

        if (day_number == 1) System.out.println("понедельник");
        if (day_number == 2) System.out.println("вторник");
        if (day_number == 3) System.out.println("среда");
        if (day_number == 4) System.out.println("четверг");
        if (day_number == 5) System.out.println("пятница");
        if (day_number == 6) System.out.println("суббота");
        if (day_number == 7) System.out.println("воскресенье");
        if ((day_number < 1) || (day_number > 7)) System.out.println("такого дня недели не существует");
    }
}