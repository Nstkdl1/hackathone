package com.company;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
    int [] myArray = new int [] {1,6,7,2,44,8};

    boolean isSort = false;
    int temp;
    while(!isSort) {
        isSort = true;
        for (int i = 0; i < myArray.length -1; i++) {
            if (myArray [i] > myArray [i+1]) {
                isSort = false;
                temp = myArray [i];
                myArray [i] = myArray [i+1];
                myArray [i+1] = temp;
            }
        }

    }
    System.out.println("Sorted array : " + Arrays.toString(myArray));
}}
