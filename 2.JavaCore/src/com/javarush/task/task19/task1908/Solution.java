package com.javarush.task.task19.task1908;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = inBR.readLine();
            String fileName2 = inBR.readLine();

            try (BufferedReader fileBR = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter filBW = new BufferedWriter(new FileWriter(fileName2))) {

                while (fileBR.ready()) {
                    int[] ints = Arrays.stream(fileBR.readLine().split(" "))
                            .map(x -> x.trim())
                            .filter(x -> {
                                try {
                                    Integer.parseInt(x);
                                    return true;
                                } catch (NumberFormatException e) {
                                    return false;
                                }
                            }).mapToInt(x -> Integer.parseInt(x)).toArray();

                //    System.out.println(Arrays.toString(ints));


                    String s = Arrays.stream(ints).boxed().collect(Collectors.toList()).
                            stream().map(x -> x + " ").collect(Collectors.joining());
                    System.out.print(s);
                    filBW.write(s);

                }
            }
        }
    }
}



