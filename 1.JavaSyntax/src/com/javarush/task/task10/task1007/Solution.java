package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        System.out.println(l);
        int x = (byte) 0b1000_1100_1010;
        System.out.println(x);
        double m =  110_987_654_6299.123_34;
        float f = (byte)  l++ + 10 + ++x - (float) m;
        l = (long) f / 1000l + 1234567;
        System.out.println(l);
    }
}w