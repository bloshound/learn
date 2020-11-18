package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     String snumber = reader.readLine();
     int number =Integer.parseInt(snumber);


     if (number > 0){
         System.out.println(number*2);
     }
     if (number == 0){
         System.out.println(number);
     }
     if (number < 0){
         System.out.println(number + 1);
     }

}
}