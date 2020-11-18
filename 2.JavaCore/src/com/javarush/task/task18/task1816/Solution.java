package com.javarush.task.task18.task1816;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {

    public static final Set<Character> alphabet = setEnglishAlphabet();
    public static void main(String[] args) throws IOException {

        BufferedReader fileBR = new BufferedReader(new FileReader(args[0]));
        int count = 0;
        while (fileBR.ready()){
            char c = (char) fileBR.read();
            if(alphabet.contains(c)) count++;
        }
        fileBR.close();
        System.out.println(count);
    }

    static private Set<Character> setEnglishAlphabet(){

        Character[] englishAlphabet = new Character[52];
        int j = 0;
        for (char i = 'a'; i <= 'z'; i++, j++) {
            englishAlphabet[j] = i;
        }
        for (char i = 'A'; i <= 'Z'; i++, j++) {
            englishAlphabet[j] = i;
        }
        return new HashSet<>(Arrays.asList(englishAlphabet));
    }
}
