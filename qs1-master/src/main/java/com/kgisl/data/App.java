package com.kgisl.data;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] intArray = { 1, 2, 3, 4, 5 };
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));
        // [5, 4, 3, 2, 1]

    }
}
