package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        for (int i = 1; i <= 12; i++) {
           if ((month == 1)|(month == 2)|(month == 12)) {
               System.out.println("зима");
           }
           if ((month >= 3)&(month < 6)){
               System.out.println("весна");
           }
        }

    }
}