package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Order {
    private User user;
    private Product product;
    private int quantity;
    private LocalDateTime orderTime;

    public Order(final User user, final Product product, int quantity, final LocalDateTime orderTime) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}