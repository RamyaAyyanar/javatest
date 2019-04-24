package com.kgisl.data;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CrudArrayList {

    public static void main(String[] args) {
        // List<EmployeeConstructor> l=Arrays.asList(new )
        ArrayList<EmployeeConstructor> arr = new ArrayList<EmployeeConstructor>(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Create 2.Update 3.Delete 4.Display 5.Exit");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        switch (ch) {
        case 1:
            System.out.println("1.Create");
            System.out.println("Enter number of input:");
            int x = sc.nextInt();
            for (EmployeeConstructor i : arr) {
                System.out.println("Enter id:");
                int id = sc.nextInt();
                System.out.println("Enter Name:");
                String names = sc.nextLine();
                System.out.println("Enter Salary:");
                float sal = sc.nextInt();
            }
            break;
        case 2:
            System.out.println("2.Update");
            for (int j = 0; j < arr.length; j++) {

            }
            break;
        case 3:
            System.out.println("3.Delete");
            System.out.println("Enter remove element:");
            int del = sc.nextInt();
            arr.remove(del);
            
            break;
        case 4:
            System.out.println("4.Display");
            System.out.println(i);
            break;
        case 5:
            System.exit(0);
        }

    }
}