package com.kodilla.exception.test;


public class ExceptionHandling extends Exception {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println("Method return: " + secondChallenge.probablyIWillThrowException(1.33, 20.00));
        }
        catch (Exception e) {
            System.out.println("Try write x >= 1 and x < 2 and y <> 1.5");
        }
        finally {
            System.out.println("End of process.");
        }

    }
}
