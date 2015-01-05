package com.fourpoint.orders;

class CustomerBuilder {

    private AddressBuilder addressBuilder;
    private String name;

    public static CustomerBuilder aCustomer() {return new CustomerBuilder();}

    public Customer build() {
        return new Customer(name, addressBuilder.build());
    }

    public CustomerBuilder with(AddressBuilder addressBuilder) {
        this.addressBuilder = addressBuilder;
        return this;
    }

    public CustomerBuilder named(String name) {
        this.name = name;
        return this;
    }
}
