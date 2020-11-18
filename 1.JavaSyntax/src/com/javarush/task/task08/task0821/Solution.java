package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map <String, String> poeples = new HashMap<>();
        poeples.put("Иванов", "Иван");
        poeples.put("Петров", "Петр");
        poeples.put("Сидоров", "Сидор");
        poeples.put("Козлов", "Иван");
        poeples.put("Фомин", "Фома");
        poeples.put("Ленин", "Игнат");
        poeples.put("Комин", "Иван");
        poeples.put("Ленин", "Иван");
        poeples.put("Сталин", "Александр");
        poeples.put("Гладкин", "Александр");


        return poeples;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
