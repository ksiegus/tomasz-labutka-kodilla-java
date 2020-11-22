package com.kodilla.good.patterns.food2door;


public class OrderRequest {
    private Order order;

    public OrderRequest(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
