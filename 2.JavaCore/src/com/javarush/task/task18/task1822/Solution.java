package com.javarush.task.task18.task1822;

import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileBR = new BufferedReader(new FileReader(bR.readLine()));
        bR.close();
        int id = Integer.parseInt(args[0]);

        while (fileBR.ready()) {
            String line = fileBR.readLine();
            findAndPrint(id, line);
        }
        fileBR.close();
    }

    public static void findAndPrint(int id, String line) throws IOException {
        String idSubString = line.substring(0, line.indexOf(" "));
        int currentId = Integer.parseInt(idSubString);
        if (id == currentId) System.out.println(line);
    }
}
