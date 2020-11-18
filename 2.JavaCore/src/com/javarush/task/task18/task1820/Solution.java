package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inputBR = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = inputBR.readLine();
        String fileName2 = inputBR.readLine();
        inputBR.close();
        BufferedReader fileBR = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileBW = new BufferedWriter(new FileWriter(fileName2));

        while (fileBR.ready()) {
            String[] doublesStrings = fileBR.readLine().split(" ");
            for (String string : doublesStrings) {
                int i = (int) Math.round(Double.parseDouble(string));
                fileBW.write(i + " ");
                fileBW.flush();
            }
        }
        fileBR.close();
        fileBW.close();
    }
}
