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

        // filtering, mapping, reducing

        // 주문데이터에서 가격이 만불이상이고 주문자 이름이 kim인 주문의 평균 가격을 구하세요.
        double kim = orderList.stream()
                .filter(p -> p.getPrice() >= 10000)  // Stream<Order>
                .filter(p -> p.getOrderPerson().equals("kim"))  // Stream<Order>
                .mapToInt(p -> p.getPrice())  // cf. IntStream vs. Stream<Integer>
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
