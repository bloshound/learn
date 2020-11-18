package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream printOutS = System.out;
        ByteArrayOutputStream bAOS = new ByteArrayOutputStream();
        PrintStream newPrintOutS = new PrintStream(bAOS);
        System.setOut(newPrintOutS);
        testString.printSomething();

        String testStrings = bAOS.toString();
        String recklama = "JavaRush - курсы Java онлайн";

        System.setOut(printOutS);

        Function<String, String> function = s -> {
            if (testStrings.indexOf(s) % 3 == 0 ) return (recklama + System.lineSeparator() + s + System.lineSeparator());
            else return s + System.lineSeparator();
        };

        String newString = Arrays.stream(bAOS.toString().split(System.lineSeparator())).map(function).collect(Collectors.joining());
        // String[] st = bAOS.toString().split(System.lineSeparator());
        // System.out.println(Arrays.toString(st));
        System.out.print(newString);
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}

