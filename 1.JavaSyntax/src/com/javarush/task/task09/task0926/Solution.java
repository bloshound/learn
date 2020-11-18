package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        int[] lenghArray = new int[]{5, 2, 4, 7, 0};
        ArrayList<int[]> arrayList = new ArrayList<>();

        for (int x : lenghArray) {

            int[] array = new int[x];

            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            arrayList.add(array);
        }
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
