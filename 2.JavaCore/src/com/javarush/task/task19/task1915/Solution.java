package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        try (BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter fileBW = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inBR.readLine())))) {

                PrintStream printOutS = System.out;
                ByteArrayOutputStream bAOS = new ByteArrayOutputStream();
                PrintStream newPrintOutS = new PrintStream(bAOS);
                System.setOut(newPrintOutS);

                testString.printSomething();
                String string = bAOS.toString();
                fileBW.write(string);
                System.setOut(printOutS);
                System.out.println(string);

            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

