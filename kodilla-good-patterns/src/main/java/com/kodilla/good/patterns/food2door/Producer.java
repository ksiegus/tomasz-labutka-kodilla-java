package com.kodilla.good.patterns.food2door;

import java.util.Random;

abstract class Producer {
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean checkAvailability(Product product, int quantity) {
        Random random = new Random();

        if (random.nextInt(2) == 1) {
            System.out.println("Producer: "+ getName() + " - Product: " + product.getName() + " is available.");
            return true;
        }
        else {
            System.out.println("Producer: "+ getName() + " - Product: " + product.getName() + " is unavailable.");
            return false;
        }

    }
    public void sendEmail() {
        System.out.println("Producer: "+ getName() + " - Send order to producer.");
    }

    public void createOrder() {
        System.out.println("Producer: "+ getName() + " - Create order.");
    }

    public boolean process(Product product, int quantity) {
        if (this.checkAvailability(product, quantity)) {
            sendEmail();
            createOrder();
            return true;
        }
        return false;
    }
}
