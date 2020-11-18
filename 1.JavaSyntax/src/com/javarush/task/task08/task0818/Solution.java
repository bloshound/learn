package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> Castomers = new HashMap();
        Castomers.put("Иванов", 3200);
        Castomers.put("Петров", 2600);
        Castomers.put("Сидоров", 1500);
        Castomers.put("Козлов", 200);
        Castomers.put("Фомин", 2200);
        Castomers.put("Игнатьев", 500);
        Castomers.put("Комин", 2000);
        Castomers.put("Ленин", 400);
        Castomers.put("Сталин", 900);
        Castomers.put("Гладкин", 100);

        return Castomers;
    }


    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) iterator.remove();
        }

    }

    public static void main(String[] args) {

        Map map = createMap();
       removeItemFromMap(map);
       // System.out.println(map);

    }
}