package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input_string = reader.readLine();

        String string_N = reader.readLine();
        double N = Double.parseDouble(string_N);

        if(N > 0){
            while (N > 0){
                System.out.println(input_string);
                N--;
            }
        }
    }
}
