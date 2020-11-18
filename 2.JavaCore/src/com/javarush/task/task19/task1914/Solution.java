package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream printOutS = System.out;
        ByteArrayOutputStream bAOS = new ByteArrayOutputStream();
        PrintStream newPrintOutS = new PrintStream(bAOS);

        System.setOut(newPrintOutS);
        testString.printSomething();


        String string = bAOS.toString();
        Pattern pattern = Pattern.compile("[\\d]+ [*[-+]]? [\\d]+ = ");
        Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            String[] elements = string.split("[ ]+");
            if (elements[1].equals("+")) {
                string = elements[0] + " " + elements[1] + " " + elements[2] +
                        " " + elements[3] + " " + (Integer.parseInt(elements[0]) + Integer.parseInt(elements[2]));
            }
            if (elements[1].equals("-")) {
                string = elements[0] + " " + elements[1] + " " + elements[2] +
                        " " + elements[3] + " " + (Integer.parseInt(elements[0]) - Integer.parseInt(elements[2]));
            }

            if (elements[1].equals("*")) {
                string = elements[0] + " " + elements[1] + " " + elements[2] +
                        " " + elements[3] + " " + (Integer.parseInt(elements[0]) * Integer.parseInt(elements[2]));
            }
        }

        System.setOut(printOutS);
        System.out.println(string);

    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

