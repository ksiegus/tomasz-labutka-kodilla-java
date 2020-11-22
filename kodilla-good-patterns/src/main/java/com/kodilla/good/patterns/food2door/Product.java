package com.kodilla.good.patterns.food2door;

public class Product {
    private String name;
    private double price;
    private Producer producer;

    public Product(Producer producer, String name, double price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
