package com.object.equalshashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class EqualsHashcodeTester {

    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
        maxValue = maxValue + 1;
        System.out.println(maxValue);


        // What is constructor?
//        Elephant one = new Elephant(2, "Jambo");
//        Elephant two = new Elephant(2, "Jambo");
//
//        System.out.println(one.equals(two));
//        System.out.println(one.hashCode());
//        System.out.println(two.hashCode());

        // 1265094477

//        System.out.println(one.equals(two));
//
//        Elephant a = null;
//        System.out.println(one.equals(null));
////
//        System.out.println(one.equals(two));
//
//        // How it works in lists
//        List<Elephant> list = new ArrayList<>();
//
//        list.add(one);
//        System.out.println(list.contains(two));

        // How it works in sets (unique elements)
//        Set<Elephant> set = new HashSet<>();
//        set.add(one);
//        set.add(two);
//
//        System.out.println(set.size());

        // objects equality
//        System.out.println("Object equality");
//        System.out.println(one.equals(two));
//        System.out.println(one.hashCode() + " " + two.hashCode());

        // FIX EXAMPLE WITH CARDS!!!!

        // hashcode is changed with object modification
//        System.out.println(one.hashCode());
//        System.out.println(set.contains(one));
//        one.age = 5;
//        System.out.println(one.hashCode());
//        System.out.println(set.contains(one));


    }
}
