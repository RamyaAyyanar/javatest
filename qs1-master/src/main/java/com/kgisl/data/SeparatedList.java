package com.kgisl.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SeparatedList
 */
public class SeparatedList {

    public static void main(String[] args) {
String commaSeparated = "item1 , item2 , item3";
System.out.println("String :"+commaSeparated);
        List<String> l=Arrays.asList(commaSeparated);
        System.out.println("String to List:"+l);
    }
}