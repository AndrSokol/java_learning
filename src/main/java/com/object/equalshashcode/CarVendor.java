package com.object.equalshashcode;

import java.util.Objects;

public class CarVendor {
    String name;
    String country;

    public CarVendor(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarVendor carVendor = (CarVendor) o;
        return Objects.equals(name, carVendor.name) &&
                Objects.equals(country, carVendor.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }
}
