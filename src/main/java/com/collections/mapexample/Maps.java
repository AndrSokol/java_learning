package com.collections.mapexample;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static com.collections.mapexample.CarMakerEnum.BMW;
import static com.collections.mapexample.CarMakerEnum.MAZDA;
import static com.collections.mapexample.CarMakerEnum.TOYOTA;
import static com.collections.mapexample.ColorEnum.BLACK;
import static com.collections.mapexample.ColorEnum.GREEN;
import static com.collections.mapexample.ColorEnum.RED;

public class Maps {
    public static void main(String[] args) {
        Car greenToyota = new Car(TOYOTA, GREEN, 2010);
        Car redMazda = new Car(MAZDA, RED, 2015);
        Car blackBMW = new Car(BMW, BLACK, 1995);

//        Set<Car> set = new HashSet<>();
//
//        set.add(greenToyota);
//        set.add(greenToyota);
//        set.add(redMazda);
//        set.add(blackBMW);
//        set.add(blackBMW);
//        set.add(null);
//        set.add(null);
//        set.add(null);
//
//        System.out.println(set);

//        Map<String, Car> cars = new HashMap<>();
//        Map<String, Car> cars = new TreeMap<>();

        Map<String, Car> cars = new TreeMap<>(Comparator.reverseOrder());

        cars.put("A-111-X", greenToyota);
        cars.put("C-333-Z", blackBMW);
        cars.put("B-222-Y", redMazda);

        System.out.println("HC: " + "A-111-X".hashCode());

        // Get object by key
        Car car1 = cars.get("A-111-X");
        System.out.println("Get car by number: " + car1);

        // Get keys
        Set<String> keys = cars.keySet();
        System.out.println("Get keys: " + keys);

        // Get values
        Collection<Car> values = cars.values();
        System.out.println("Get values: " + values);

        // Pairs loop
        System.out.println("Looping by pairs");
        for(Map.Entry pair : cars.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        System.out.println(cars);
    }
}
