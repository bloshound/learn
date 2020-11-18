package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.stream.Collectors;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader inBR = new BufferedReader(new InputStreamReader(System.in))) {

            try (BufferedReader fileBR = new BufferedReader(new FileReader(inBR.readLine()))) {
                Document document = Jsoup.parse(fileBR.lines().collect(Collectors.joining()), "UTF-8", Parser.xmlParser());

                Elements elements = document.select(args[0]);
                for (Element element : elements) {
                    System.out.println(element);
                }
            }
        }
    }
}
