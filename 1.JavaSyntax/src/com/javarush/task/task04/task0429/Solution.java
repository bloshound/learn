package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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


        int quantity_positive_number = 0;
        int quantity_negative_number = 0;


        if ((number1 > 0)) quantity_positive_number++;
        else if (number1 == 0) {
            quantity_negative_number = quantity_negative_number + 0;
            quantity_positive_number = quantity_positive_number + 0;
        } else quantity_negative_number++;

        if ((number2 > 0)) quantity_positive_number++;
        else if (number2 == 0) {
            quantity_negative_number = quantity_negative_number + 0;
            quantity_positive_number = quantity_positive_number + 0;
        } else quantity_negative_number++;

        if ((number3 > 0)) quantity_positive_number++;
        else if (number3 == 0) {
            quantity_negative_number = quantity_negative_number + 0;
            quantity_positive_number = quantity_positive_number + 0;
        } else quantity_negative_number++;

        System.out.println("количество отрицательных чисел: " + quantity_negative_number);
        System.out.println("количество положительных чисел: " + quantity_positive_number);
    }
}

