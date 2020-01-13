package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class HealthyShop implements FoodDistributor {
    private static final String NAME = "Healthy Shop";

    @Override
    public OrderDto process(Order order) {
        boolean isOrdered = new Random().nextInt(2)>0;

        if (isOrdered) {
            System.out.println("Your order " + order.getOrderNumber() + " of " + order.getProduct() + " is in progress now.");
            return new OrderDto(true,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        } else {
            System.out.println("Sorry something went wrong");
            return new OrderDto(false,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        }
    }

    @Override
    public String getDistributorName() {
        return NAME;
    }
}