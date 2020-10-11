package com.kodilla;

import org.springframework.boot.SpringApplication;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractBFromA(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("addToB: " + calc.addAToB(555,666)  );
        System.out.println("subtractBFromA: " + calc.subtractBFromA(555,666)  );
    }

}
