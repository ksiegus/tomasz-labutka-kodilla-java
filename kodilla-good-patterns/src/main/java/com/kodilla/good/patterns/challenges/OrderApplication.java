package com.kodilla.good.patterns.challenges;

public class OrderApplication {

    public static void main(String[] args) {
        Product product1 = new Product("game 1", 45.00);
        Product product2 = new Product("game 2", 35.00);

        Product product3 = new Product("toothbrush 1", 12.00);
        Product product4 = new Product("toothbrush 2", 24.00);

        Product product5 = new Product("slippers 1", 112.00);
        Product product6 = new Product("slippers 2", 33.00);

        OrderItem orderItem1 = new OrderItem(product1, 2);
        OrderItem orderItem2 = new OrderItem(product4, 1);
        OrderItem orderItem3 = new OrderItem(product5, 2);

        Order order1 = new Order();
        order1.addItem(orderItem1);
        order1.addItem(orderItem2);
        order1.addItem(orderItem3);


        User user = new User("Tomasz", "Tomaszewski", "email@email.pl", "+48999999999");
        OrderRequest orderRequest = new OrderRequest(user, order1);

        ProductOrderService service = new ProductOrderService(new OrderInformationService(), new UserOrderService(), new OrderRepositoryService());
        OrderDto orderDto = service.process(orderRequest);

        System.out.println(orderDto.getUser().getFirstName() + " " + orderDto.getUser().getLastName() + ", result " + orderDto.isOrdered());
    }
}
