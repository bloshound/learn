package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {


    public static void main(String[] args) throws IOException {

        //    char[] regex = {' ', ',', '.', '!', '?', '"', ';', ':', '[', ']', '(', ')', '\n',
        //        '\r', '\t'};
        String splitter = "[ ,.!?\";:\\]\\[\\(\\)\\\n\\\r\\\t]+";

        try (BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedReader fileBR = new BufferedReader(new FileReader(inBR.readLine()))) {

                int count = 0;

                while (fileBR.ready()) {
                    String line = fileBR.readLine();
                    int length = Arrays.stream(line.split(splitter)).filter(s -> s.equals("world")).toArray().length;
                    count = count + length;
                }
                System.out.println(count);
            }
        }
    }
}
