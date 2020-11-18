package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        String Lover_name = bufer.readLine();

        for (int i = 0; i < 10 ; i++) {
            System.out.println(Lover_name + " любит меня.");

        }

    }
}
