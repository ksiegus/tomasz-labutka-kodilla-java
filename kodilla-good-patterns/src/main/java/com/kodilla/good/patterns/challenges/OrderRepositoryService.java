package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class OrderRepositoryService implements RepositoryService {
    public void createOrder(User user, Order order) {
        System.out.println("Create Order in Database\nUser: " + user.getFirstName() + " " + user.getLastName() + "\nOrder: " + order.getItems().stream().map(t -> t.getProduct()).map(t -> t.getName()).collect(Collectors.joining( ", " ) ));
    }
}
