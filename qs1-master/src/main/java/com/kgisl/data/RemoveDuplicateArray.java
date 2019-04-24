package com.kgisl.data;

import java.util.ArrayList;

/**
 * RemoveDuplicateArray
 */
public class RemoveDuplicateArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
       arr.add(2);
       arr.add(2);
       arr.add(11);
       arr.add(3);
       arr.add(5);
       arr.add(3);

       System.out.println("Array List:"+arr);
     for (int s:arr)
    if(arr.indexOf(s)==arr.lastIndexOf(s)){
        System.out.println("values:"+s);
    }

       }
    
}