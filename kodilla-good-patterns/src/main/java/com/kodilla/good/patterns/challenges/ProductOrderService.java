package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private RepositoryService repositoryService;

    public ProductOrderService(final OrderInformationService informationService,
                           final OrderService orderService,
                           final OrderRepositoryService repositoryService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.repositoryService = repositoryService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrder());

        if (isOrdered) {
            repositoryService.createOrder(orderRequest.getUser(), orderRequest.getOrder());
            informationService.inform(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
