package com.kodilla.spring.calculator;

import com.kodilla.spring.library.LibraryDbController;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a+b;
        this.display.displayValue(result);
        return result;
    }
    public double sub(double a, double b) {
        double result = a-b;
        this.display.displayValue(result);
        return result;
    }
    public double mul(double a, double b) {
        double result = a*b;
        this.display.displayValue(result);
        return result;
    }
    public Double div(double a, double b) {
        if (b == 0) { return null; }
        double result = a/b;
        this.display.displayValue(result);
        return result;
    }
}
