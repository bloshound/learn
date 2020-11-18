package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> Castomers = new HashMap();
        Castomers.put("Иванов", "Иван");
        Castomers.put("Петров", "Петр");
        Castomers.put("Сидоров", "Сидор");
        Castomers.put("Козлов", "Иван");
        Castomers.put("Фомин", "Фома");
        Castomers.put("Игнатьев", "Игнат");
        Castomers.put("Комин", "Иван");
        Castomers.put("Ленин", "Иван");
        Castomers.put("Сталин", "Александр");
        Castomers.put("Гладкин", "Александр");

        return Castomers;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {

            String value = pair.getValue();

            removeItemFromMapByValue(map, value);
            System.out.println(value);
            System.out.println(map);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        Map map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}
