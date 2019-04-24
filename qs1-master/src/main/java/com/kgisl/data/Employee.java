package com.kgisl.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public static void main(String... args) {

        ArrayList<Float> salary = new ArrayList<Float>();
        salary.add(11.5f);
        salary.add(300.7f);
        salary.add(1000.6f);
        System.out.println("Salary:" + salary);       
       
        List<String> name = new ArrayList<String>();
        name.add("Rams");
        name.add("Saru");
        System.out.println("Name:" + name);
        int empid[] = { 2, 4, 1, 5 };
        Arrays.sort(empid);
        System.out.println("Binary Search emp id 1:" + Arrays.binarySearch(empid, 5));
        int[] copy = Arrays.copyOf(empid, 4);
        System.out.println("CopyOf:" + Arrays.toString(copy));
        Arrays.fill(empid, 22);
        List<String> ls = Arrays.asList("Raj", "Moni", "Cury");
        // ls.add("aa");
        // ls.add("bb");
        System.out.println("AsList:" + ls);
        System.out.println("Fill Emp Id:" + Arrays.toString(empid));
    }
}