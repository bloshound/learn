package com.javarush.task.task18.task1827;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        URL url = new URL("google.com");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        FileWriter fw = new FileWriter("sda");

    }
}
