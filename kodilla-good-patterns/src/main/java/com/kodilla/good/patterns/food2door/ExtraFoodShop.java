package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class ExtraFoodShop implements FoodDistributor {
    private static final String NAME = "Extra Food Shop";

    @Override
    public OrderDto process(Order order) {
        boolean isOrdered = new Random().nextInt(2)>0;

        if (isOrdered) {
            System.out.println("The order " + order.getOrderNumber() + " has been submitted for processing");
            return new OrderDto(true,
                    order.getOrderTime(),
                    order.getFoodDistributor(),
                    order.getProduct(),
                    order.getQuantity());
        } else {
            System.out.println("The order " + order.getOrderNumber() + " has not been submitted for processing. Please contact us.");
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