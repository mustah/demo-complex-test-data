package com.fourpoint.orders;

import java.util.ArrayList;
import java.util.List;

class Order {

    private final List<OrderLine> orderLines = new ArrayList<>();
    private final Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }
}
