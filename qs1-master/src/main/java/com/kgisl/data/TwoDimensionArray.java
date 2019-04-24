package com.kgisl.data;

import java.util.Arrays;

/**
 * TwoDimensionArray
 */
public class TwoDimensionArray {

    public static void main(String[] args) {
        String[][] deepArray = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };
        for (String[] s : deepArray) {
            System.out.println("Array values:" + Arrays.toString(s));
        }
    }
}