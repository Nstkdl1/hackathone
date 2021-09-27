package com.company;
import java.util.*;
import java.io.*;
public class Ex3 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        StringBuilder str = new StringBuilder();
        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 0; i < 10000; i++) {
                int num = ((int)(Math.random() * 500) + 1);
                output.print(num);
                output.print(" ");
                str.append(num + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(str.toString());
    }}