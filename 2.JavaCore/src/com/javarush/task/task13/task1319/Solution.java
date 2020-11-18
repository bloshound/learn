package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();

            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            while (true) {

                String string = bufferedReader.readLine();
                bufferedWriter.write(string + "\n");
                if (string.equals("exit")) break;
            }
            bufferedWriter.close();

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedFileReader = new BufferedReader(fileReader);


            while (true) {

                String x = bufferedFileReader.readLine();
                if (x == null) break;
                System.out.println(x);
            }

        } catch (IOException e) {
            System.out.println(e.getStackTrace() + " !!!! " + e.fillInStackTrace());
        }
    }
}