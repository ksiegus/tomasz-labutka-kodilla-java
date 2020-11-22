package com.kodilla.good.patterns.food2door;

public class HealthyShop extends Producer {
    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public boolean process(Product product, int quantity) {
        if (this.checkAvailability(product, quantity)) {
            createOrder();
            return true;
        }
        return false;
    }
}
