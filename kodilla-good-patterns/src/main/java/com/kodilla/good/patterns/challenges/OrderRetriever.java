package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve() {

        User user = new User("paziek88", "Damian", "Paziewski");
        Product product = new Product("PS4", "Konsola do gier", new BigDecimal("1799"));
        int quantity = 2;
        LocalDateTime orderTime = LocalDateTime.of(2017, 10, 1, 12, 8, 23);

        return new Order(user, product, quantity, orderTime);

    }
}