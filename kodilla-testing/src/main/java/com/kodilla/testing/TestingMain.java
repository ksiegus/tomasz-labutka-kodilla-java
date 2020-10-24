package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int resultAdd = calc.add(5, 5);
        if (resultAdd == 10) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test Error!");
        }

        int resultSubtract = calc.subtract(30, 20);
        if (resultSubtract == 10) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract test Error!");
        }
    }
}