package com.javarush.task.task19.task1920;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader fileBR = new BufferedReader(new FileReader(args[0]))) {

            Map<String, Double> mostReached = fileBR.lines()
                    .map(x -> x.trim())
                    .collect(Collectors.toMap(
                            x -> x.split("[ ]+", 2)[0],
                            x -> Double.parseDouble(x.split("[ ]+", 2)[1]),
                            (v1, v2) -> v1 + v2,
                            () -> new TreeMap<>()
                    ));

           // System.out.println(mostReached);
            Optional<Double> d = mostReached.values().stream().max(Comparator.comparingDouble(d2 -> d2));
            Double max = d.get();
            mostReached.entrySet().stream().filter(x -> x.getValue().equals(max)).forEach(x -> System.out.println(x.getKey()));

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
