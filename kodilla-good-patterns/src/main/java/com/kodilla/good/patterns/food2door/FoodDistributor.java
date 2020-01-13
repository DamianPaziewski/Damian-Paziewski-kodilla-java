package com.kodilla.good.patterns.food2door;

public interface FoodDistributor {

    OrderDto process(Order order);
    String getDistributorName();
}