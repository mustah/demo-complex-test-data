package com.fourpoint.orders;

class AddressBuilder {

    private String street;
    private String city;
    private PostCode postCode;

    public static AddressBuilder anAddress() {return new AddressBuilder();}

    public Address build() {
        return new Address(street, city, postCode);
    }

    public AddressBuilder withStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder with(PostCode postCode) {
        this.postCode = postCode;
        return this;
    }
}
