package org.example;


import java.io.*;
import java.io.IOException;
import java.sql.SQLOutput;


public class Data {
    public static void main(String[] args) {


        File file = new File("DataHere.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

