package com.kodilla.good.patterns.food2door;

import java.security.KeyStore;
import java.util.*;

public class OrderApplication {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        HealthyShop healthyShop = new HealthyShop("HealthyShop");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

        Product product1 = new Product(extraFoodShop, "apple", 10.00);
        Product product2 = new Product(extraFoodShop, "pears", 5.40);
        Product product3 = new Product(extraFoodShop, "plums", 2.60);

        Product product4 = new Product(healthyShop, "chicken", 15.00);
        Product product5 = new Product(healthyShop, "milk", 2.10);
        Product product6 = new Product(healthyShop, "eggs", 3.20);

        Product product7 = new Product(glutenFreeShop, "cabbage", 25.00);
        Product product8 = new Product(glutenFreeShop, "radish", 4.10);
        Product product9 = new Product(glutenFreeShop, "potatoes", 1.50);

        OrderItem orderItem1 = new OrderItem(product1, 3);
        OrderItem orderItem2 = new OrderItem(product2, 9);
        OrderItem orderItem3 = new OrderItem(product3, 12);
        OrderItem orderItem4 = new OrderItem(product4, 11);
        OrderItem orderItem5 = new OrderItem(product5, 7);
        OrderItem orderItem6 = new OrderItem(product6, 3);
        OrderItem orderItem7 = new OrderItem(product7, 1);
        OrderItem orderItem8 = new OrderItem(product8, 44);
        OrderItem orderItem9 = new OrderItem(product9, 23);

        Order order1 = new Order();
        order1.addItem(orderItem1);
        order1.addItem(orderItem2);
        order1.addItem(orderItem3);
        order1.addItem(orderItem4);
        order1.addItem(orderItem5);
        order1.addItem(orderItem6);
        order1.addItem(orderItem7);
        order1.addItem(orderItem8);
        order1.addItem(orderItem9);

        OrderRequest orderRequest = new OrderRequest(order1);
        OrderService service = new OrderService();
        OrderDto orderDto = service.process(orderRequest);
        for(OrderDtoEntry orderDtoEntry : orderDto.getResult()) {
            System.out.println("Order product " + orderDtoEntry.getOrderItem().getProduct().getName() + " from producer " + orderDtoEntry.getOrderItem().getProduct().getProducer().getName() + " with result " + orderDtoEntry.isOrdered());
        }




    }
}