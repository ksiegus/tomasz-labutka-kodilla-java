package com.kodilla.good.patterns.food2door;

import java.util.*;

public class OrderService {

    public OrderDto process(final OrderRequest orderRequest) {
        OrderDto orderDto = new OrderDto();

        List<OrderItem> orderItems = orderRequest.getOrder().getItems();
        for(OrderItem orderItem : orderItems) {
            boolean isOrdered = orderItem.getProduct().getProducer().process(orderItem.getProduct(), orderItem.getQuantity());
            OrderDtoEntry orderDtoEntry = new OrderDtoEntry(orderItem, isOrdered);
            orderDto.addResult(orderDtoEntry);
        }
        return orderDto;
    }

}