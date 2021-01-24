package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Banana");

        System.out.println("Elements after adding: " + fruits);

        // Get elements by index
        String firstElement = fruits.get(0);
        System.out.println("Get element: " + firstElement);

        // Check that element exists
        boolean result = fruits.contains("Orange");
        System.out.println("Is element exists: " + result);

        // Add element in the middle
        fruits.add(1, "Banana");
        System.out.println("Elements after adding in the middle: " + fruits);

        // Set element
        fruits.set(1, "Watermelon");
        System.out.println("Elements after set: " + fruits);

        // Remove element by value
        fruits.remove("Watermelon");
        System.out.println("Elements after removing by value: " + fruits);

        // Remove element by index
        fruits.remove(1);
        System.out.println("Elements after removing by index: " + fruits);
    }
}
