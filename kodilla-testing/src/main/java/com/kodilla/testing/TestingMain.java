package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calc = new Calculator();
        int resultAdd = calc.add(5,10);

        if (resultAdd == 15){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        int resultSubtract = calc.subtract(5,10);

        if (resultSubtract == -5){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}