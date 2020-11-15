package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }


}
