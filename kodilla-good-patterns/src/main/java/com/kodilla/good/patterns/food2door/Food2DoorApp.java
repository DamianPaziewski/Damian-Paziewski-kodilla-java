package com.kodilla.good.patterns.food2door;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Food2DoorApp {
    public static void main(String[] args) {
        OrderRetriever ordersList = new OrderRetriever();
        ArrayList<Order> orders = ordersList.retrieve();

        for (Order order: orders) {
            OrderDto orderDto = order.getFoodDistributor().process(order);
            if (orderDto.isOrdered()) {
                System.out.println("Information about your order:"
                        + "\ndate: " + orderDto.getOrderTime().format(DateTimeFormatter.ISO_DATE)
                        + ", time: " + orderDto.getOrderTime().format(DateTimeFormatter.ISO_TIME)
                        + "\nproduct: " + orderDto.getProduct().getProductName()
                        + "\nquantity: " + orderDto.getQuantity()
                        + "\ndistributor: " + orderDto.getFoodDistributor().getDistributorName());
            }
        }
    }
}