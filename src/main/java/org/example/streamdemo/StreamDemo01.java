package org.example.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<Order> orderList = Arrays.asList(
                new Order(1, "kim", "iphone", 10000),
                new Order(2, "lee", "ipad", 15000),
                new Order(3, "park", "galaxy", 8000)
        );

        double average = orderList.stream()
                .filter(p -> p.getPrice() >= 10000)
                //.filter(p -> p.getOrderPerson().equals("kim"))
                .mapToInt(p -> p.getPrice())
                .average()
                .orElse(0);


        /*List<Order> result = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getPrice() >= 10000) {
                result.add(order);
            }
        }*/

    }
}
