package com.assignment3.spark;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

/*
 * Using this file you can check your output against the expected output file. For both the tasks 1.
 */

public class Task2Check {
    public static void main(String[] args) throws IOException{
        String outputFilePath1 = args[0];
        String outputFilePath2 = args[1];
        String l1;
        String l2;

        // Read and map the original file
        Map<String, Integer> original = new HashMap<>();
        BufferedReader bf1 = new BufferedReader(new FileReader(outputFilePath1));
        while((l1=bf1.readLine()) != null) {
            if(!l1.isEmpty()) {
                l1=l1.replaceAll("\\p{Punct}", " ").strip();
                String[] subStrings = l1.split(" ");
                original.put(subStrings[0], Integer.parseInt(subStrings[1]));
            }
        }

        // Read and map the file that needs to be compared
        Map<String, Integer> copy = new HashMap<>();
        BufferedReader bf2 = new BufferedReader(new FileReader(outputFilePath2));
        while((l2=bf2.readLine()) != null) {
            if(!l2.isEmpty()) {
                l2=l2.replaceAll("\\p{Punct}", " ").strip();
                String[] subStrings = l2.split(" ");
                copy.put(subStrings[0], Integer.parseInt(subStrings[1]));
            }
        }

        // Print the verdict
        if(original.equals(copy)){
            System.out.println("Both files are the same!");
        }else{
            System.out.println("Both files are NOT the same!");
        }

        bf1.close();
        bf2.close();

    }
}
