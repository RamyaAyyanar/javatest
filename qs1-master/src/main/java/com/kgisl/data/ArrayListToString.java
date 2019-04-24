package com.kgisl.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * ArrayListToString
 */
public class ArrayListToString {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Ball");

        String[] arr = new String[list1.size()];
        arr = list1.toArray(arr);

        // // Arrays.toString(list1);
        // // String[] s = (String[]) list1.toArray();
        // List<String> l=Arrays.asList("aa","bb","cc");
        for (String s : list1)
            System.out.println("Array List to String:" + arr);
    }
}