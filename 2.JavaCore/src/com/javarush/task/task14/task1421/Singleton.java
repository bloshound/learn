package com.javarush.task.task14.task1421;
//14:20   10.09.2020
//:Singleton 

import org.w3c.dom.ls.LSOutput;

public class Singleton extends Object {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }



   public static Singleton getInstance() {

        return instance;
    }
}