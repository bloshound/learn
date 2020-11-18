package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileBR1 = new BufferedReader(new FileReader(inBR.readLine()));
             BufferedReader fileBR2 = new BufferedReader(new FileReader(inBR.readLine()))
        ) {

            List<String> fileLines1 = fileBR1.lines().collect(Collectors.toList());
            List<String> fileLines2 = fileBR2.lines().collect(Collectors.toList());

            Function<String, LineItem> typeF = x -> {
                if(fileLines1.contains(x) && fileLines2.contains(x)) return new LineItem(Type.SAME, x);
                else if (fileLines1.contains(x)) return new LineItem(Type.REMOVED, x);
                else if (fileLines2.contains(x)) return new LineItem(Type.ADDED, x);
                else return null;
            };

            List<String> mergedList = new ArrayList<>(fileLines1);

            mergedList.removeAll(fileLines2);
            mergedList.addAll(fileLines2);
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
