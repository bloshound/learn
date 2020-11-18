package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String shortest = "";  // переменная для записи самой короткой строки, пока строка длины 1
        ArrayList<String> strings = new ArrayList<>(); // создали пустой список
        ArrayList<String> shortestString = new ArrayList<>();// пустой список, запишеи сюда самык короткие строки
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String a = reader.readLine();
            strings.add(a);
            shortest = shortest + a;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < shortest.length()) shortest = strings.get(i);
        }
        // нашли самаую короткую строку, если таких строк несколько в shortest запишется последняя

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == shortest.length()) {
                shortestString.add(strings.get(i));
            }
        }
        // сравнили строки на равенстово самой короткой, добавили их в спиосок shortestString(1 или больше);

        for (int i = 0; i < shortestString.size(); i++) {
            System.out.println(shortestString.get(i));
        }
    }
}
