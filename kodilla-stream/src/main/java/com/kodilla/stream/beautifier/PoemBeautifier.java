package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public static String beautify(String a, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(a);
        System.out.println("Decorate result: " + result);
        return result;
    }


}
