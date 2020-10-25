package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forum.ForumUser;
import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.*;
import java.util.stream.Collectors;
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


        System.out.println("\nStream - People");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println("\nStream - BookDirectory - List");
        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println("\nStream - BookDirectory - Map");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("\nStream - BookDirectory - String");
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        System.out.println("\nStream - ForumUser - Map");
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBornDate().getYear() >= 2000)
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUser.size());
        theResultMapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }


}
