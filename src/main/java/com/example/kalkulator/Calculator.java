package com.example.kalkulator;

public class Calculator {
    int x;
    int y;


    public void someMethod(){
        System.out.println("It works!");
    }
    public int addition(int x, int y) {
        return x+y;
    }
    public int subtraction(int x, int y) {
        return x-y;
    }

    public static void main(String argsp[]) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
    }


}
