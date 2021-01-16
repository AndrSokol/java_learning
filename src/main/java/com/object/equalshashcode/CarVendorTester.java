package com.object.equalshashcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarVendorTester {
    public static void main(String[] args) {
        Map<CarVendor, List<String>> brandsMap = new HashMap<>();

        CarVendor toyota = new CarVendor("Toyota", "Japan");
        CarVendor vw = new CarVendor("VW", "Germany");

        brandsMap.put(toyota, Arrays.asList("Toyota", "Lexus"));
        brandsMap.put(vw, Arrays.asList("VW", "BMW", "Audi"));

        System.out.println(brandsMap.get(new CarVendor("Toyota", "Japan")));
    }
}
