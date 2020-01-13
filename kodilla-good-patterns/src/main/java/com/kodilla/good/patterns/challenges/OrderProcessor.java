package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private InfoService infoService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService,
                          final InfoService infoService,
                          final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.infoService = infoService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean isBought = orderService.createOrder(order.getUser(), order.getProduct(), order.getQuantity(),
                order.getOrderTime());

        if (isBought) {
            infoService.inform(order.getUser());
            orderRepository.addOrderToRepository(order);
            return new OrderDto(order.getUser(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}