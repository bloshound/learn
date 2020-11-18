package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileIS = new FileInputStream(inBR.readLine());
        inBR.close();

        while (fileIS.available() > 0) {
            System.out.print((char)fileIS.read());
        }
        fileIS.close();
    }
}