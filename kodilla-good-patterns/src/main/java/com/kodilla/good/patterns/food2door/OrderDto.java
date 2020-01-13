package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderDto {
    private boolean isOrdered;
    private LocalDateTime orderTime;
    private FoodDistributor foodDistributor;
    private Product product;
    private int quantity;

    public OrderDto(boolean isOrdered, LocalDateTime orderTime, FoodDistributor foodDistributor, Product product, int quantity) {
        this.isOrdered = isOrdered;
        this.orderTime = orderTime;
        this.foodDistributor = foodDistributor;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public FoodDistributor getFoodDistributor() {
        return foodDistributor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}