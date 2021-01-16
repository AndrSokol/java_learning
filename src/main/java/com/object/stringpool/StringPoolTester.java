package com.object.stringpool;

public class StringPoolTester {
    public static void main(String[] args) {
        String a = "one";
        String b = new String("one");

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
