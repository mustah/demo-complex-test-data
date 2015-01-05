package com.fourpoint.orders;

import org.junit.Test;

import static com.fourpoint.orders.AddressBuilder.*;
import static com.fourpoint.orders.CustomerBuilder.*;
import static com.fourpoint.orders.OrderBuilder.*;

public class OrderTest {

    @Test
    public void WithoutBuilders() {
        Order order = new Order(new Customer("Sherlock Holmes", new Address("221b baker street", "London", new PostCode("NW1", "3RX"))));
        order.addLine(new OrderLine("Some name 1", 1));
        order.addLine(new OrderLine("Some name 2", 3));
        order.addLine(new OrderLine("Some name 3", 6));
    }

    @Test
    public void WithBuilders() {
        Order order = anOrder()
            .madeBy(aCustomer()
                        .named("Sherlock Holmes")
                        .with(anAddress()
                                  .withStreet("221b baker street")
                                  .withCity("London")
                                  .with(new PostCode("NW1", "3RX"))))
            .with(new OrderLine("Some name 1", 1))
            .with(new OrderLine("Some name 2", 3))
            .with(new OrderLine("Some name 3", 6))
            .build();
    }
}