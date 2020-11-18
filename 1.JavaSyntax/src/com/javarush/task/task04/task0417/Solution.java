package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s_A = reader.readLine();
        String s_B = reader.readLine();
        String s_C = reader.readLine();

        int A = Integer.parseInt(s_A);
        int B = Integer.parseInt(s_B);
        int C = Integer.parseInt(s_C);

        if ((A == B) && (B == C)) {
            System.out.println(A + " " + B + " " + C);
        } else {
            if (A == B) {
                System.out.println(A + " " + B);
            } else {
                if (B == C) {
                    System.out.println(B + " " + C);
                } else {
                    if (C == A) {
                        System.out.println(C + " " + A);

                    }
                }
            }
        }
    }
}