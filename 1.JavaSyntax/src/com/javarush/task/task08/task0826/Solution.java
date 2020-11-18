package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //клонируем массив для сортировки
        int[] sortedArray = array.clone();
        //сортируем клонируемый массив
        Arrays.sort(sortedArray);
        //   System.out.println(Arrays.toString(sortedArray));
        // переворачиваем массив по клонориумому
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++, j--) {
            array[i] = sortedArray[j];
        }
        // System.out.println(Arrays.toString(array));
    }
}

