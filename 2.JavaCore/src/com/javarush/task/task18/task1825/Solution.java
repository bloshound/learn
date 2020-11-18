package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName;
        String someName = "";
        FileInputStream fileIS;

        Comparator<String> comparator = Comparator.comparingInt((String o) -> Integer.parseInt(o.split(".part")[1]));
        Set<String> parts = new TreeSet<>(comparator);

        while (!(inputFileName = inBR.readLine()).equals("end")) {
            if (someName.isEmpty()) {
                someName = inputFileName.split(".part")[0];
            }
            parts.add(inputFileName);
        }
        System.out.println(parts);
        System.out.println(someName);

        FileOutputStream fileOS = new FileOutputStream(someName, true);
        for (String part : parts) {
            fileIS = new FileInputStream(part);
            byte[] buffer = new byte[fileIS.available()];
            fileIS.read(buffer);
            fileOS.write(buffer);
            fileOS.flush();
            fileIS.close();
        }
        fileOS.close();
    }
}
