package com.fourpoint.orders;

import java.util.ArrayList;
import java.util.List;

class OrderBuilder {

    private final List<OrderLine> orderLines = new ArrayList<>();
    private CustomerBuilder customerBuilder;

    public static OrderBuilder anOrder() {
        return new OrderBuilder();
    }

    public Order build() {
        Order order = new Order(customerBuilder.build());
        orderLines.forEach(order::addLine);
        return order;
    }

    public OrderBuilder madeBy(CustomerBuilder customerBuilder) {
        this.customerBuilder = customerBuilder;
        return this;
    }

    public OrderBuilder with(OrderLine orderLine) {
        orderLines.add(orderLine);
        return this;
    }
}
