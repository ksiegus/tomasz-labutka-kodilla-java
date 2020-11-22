package com.kodilla.good.patterns.food2door;
import java.util.*;

public class OrderDto {
    private List<OrderDtoEntry> result = new ArrayList<>();

    public void addResult(OrderDtoEntry orderDtoEntry) {
        this.result.add(orderDtoEntry);
    }

    public List<OrderDtoEntry> getResult() {
        return this.result;
    }
}
