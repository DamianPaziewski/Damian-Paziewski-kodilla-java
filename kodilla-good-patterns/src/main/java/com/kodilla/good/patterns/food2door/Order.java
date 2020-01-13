package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class Order {
    private int orderNumber;
    private LocalDateTime orderTime;
    private FoodDistributor foodDistributor;
    private Product product;
    private int quantity;

    public Order(int orderNumber, LocalDateTime orderTime, FoodDistributor foodDistributor, Product product, int quantity) {
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.foodDistributor = foodDistributor;
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
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