package com.kodilla.good.patterns.food2door;

public class OrderDtoEntry {
    private OrderItem orderItem;
    private boolean isOrdered;

    public OrderDtoEntry(OrderItem orderItem, boolean isOrdered) {
        this.orderItem = orderItem;
        this.isOrdered = isOrdered;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
