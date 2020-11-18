package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try {
            try (BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in))) {
                try (BufferedReader fileBR = new BufferedReader(new FileReader(inBR.readLine()))) {

                    Function<String, String> reverseF = s -> {
                        StringBuilder sb = new StringBuilder(s);
                        return sb.reverse().toString();
                    };

                    fileBR.lines().map(reverseF).forEach(System.out::println);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}