package com.kodilla.good.patterns.challenges;

public class OrderServiceClass implements OrderService {

    public boolean order(User user, Order order) {
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " has the right to add orders.");
        return true;
    }
}
