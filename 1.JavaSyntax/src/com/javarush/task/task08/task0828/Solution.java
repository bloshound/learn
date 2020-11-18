package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mounth = reader.readLine();
        Date date = new SimpleDateFormat("MMMM", Locale.US).parse(mounth);
        Calendar inputMounth = new GregorianCalendar();
        inputMounth.setTime(date);


        List<Calendar> months = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            months.add(new GregorianCalendar(Locale.US));
            months.get(i).set(Calendar.MONTH, i);
            if(inputMounth.get(Calendar.MONTH) == months.get(i).get(Calendar.MONTH) )
                System.out.println(inputMounth.getDisplayName(Calendar.MONTH, 2, Locale.US) + " is the " + (inputMounth.get(Calendar.MONTH) + 1) + " month");;
        }


    }
}
