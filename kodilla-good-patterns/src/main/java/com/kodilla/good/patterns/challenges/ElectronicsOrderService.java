package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ElectronicsOrderService implements OrderService {

    @Override
    public boolean createOrder(User user, Product product, int quantity, LocalDateTime orderTime){
        System.out.println("ORDER SERVICE\nproduct: " + product.getProductName() + "\ncustomer: " + user.getNickname()
                + "\ndate of order: " + orderTime + "\nchosen payment method: CoD\n" + quantity);
        return true;
    }
}