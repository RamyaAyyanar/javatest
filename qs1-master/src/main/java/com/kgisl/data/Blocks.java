package com.kgisl.data;

public class Blocks {
   
    {
        System.out.println("Simple Block");
    }

    Blocks() {
        System.out.println("Constructor");
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Blocks obj = new Blocks();
//java -cp target\data-1.0-SNAPSHOT.jar com.kgisl.data.Employee
    }
}