package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Set<String> kucha = new HashSet<>();
        kucha.add("арбуз");
        kucha.add("банан");
        kucha.add("вишня");
        kucha.add("груша");
        kucha.add("дыня");
        kucha.add("ежевика");
        kucha.add("женьшень");
        kucha.add("земляника");
        kucha.add("ирис");
        kucha.add("картофель");

        for (String string : kucha) {
            System.out.println(string);
        }
    }
}



