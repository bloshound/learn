package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("рома");
        strings.add("рента");
        strings.add("лента");
        strings.add("ларек");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> modifiedStrings = new ArrayList<>();
        for (String stroka : strings) {
            if (stroka.contains("р") && stroka.contains("л")) ;
            else if (stroka.contains("р")) ;
            else if (stroka.contains("л")) {
                modifiedStrings.add(stroka);
                modifiedStrings.add(stroka);
            } else modifiedStrings.add(stroka);
        }
        return modifiedStrings;
    }
}