package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.immutable.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.*;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println("\nExpressionExecutor with Lambda expression");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nExpressionExecutor with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nPoemBeautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Tomasz Labutka", (a) -> "*** " + a + " ***");
        poemBeautifier.beautify("Tomasz Labutka", (a) -> a.toUpperCase() );
        poemBeautifier.beautify("Tomasz Labutka", (a) -> a.toLowerCase() );

        System.out.println("\nNumbersGenerator");
        NumbersGenerator.generateEven(20);

        System.out.println("\nForumUser");
        ForumUser forumUser = new ForumUser("ksiegus", "Tomasz");
        System.out.println("\nusername: " + forumUser.getUsername() + ", realname: " + forumUser.getRealName());
    }


}
