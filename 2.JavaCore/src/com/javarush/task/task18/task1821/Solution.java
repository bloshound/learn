package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = findCharacterEntries(args[0]);
       // System.out.println(map);
        for (Map.Entry pair:map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<Character, Integer> findCharacterEntries(String fileName) throws IOException {
        Map<Character, Integer> entries = new TreeMap<>();
        BufferedReader fileBR = new BufferedReader(new FileReader(fileName));

        while (fileBR.ready()) {
            char entry = (char) fileBR.read();
            entries.put(entry, entries.getOrDefault(entry, 0) + 1);
        }
        fileBR.close();
        return entries;
    }
}


