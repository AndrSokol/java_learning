package com.object.tostring;

public class ToStringTester {

    public static void main(String[] args) {

        // Default implementation for objects
//        Bird bird = new Bird();
//        System.out.println(bird);

        // Default implementation for arrays
//        int[] intArr = new int[5];
//        double[] doubleArr = new double[5];
//        short[] shortArr = new short[5];
//        String[] strArr = new String[5];
//        Bird[] birdArr = new Bird[5];
//        System.out.println(intArr);
//        System.out.println(doubleArr);
//        System.out.println(shortArr);
//        System.out.println(strArr);
//        System.out.println(birdArr);

        // Default implementation review
//        Bird bird = new Bird();
//        String hexHashCode = bird.toString().split("@")[1];
//        System.out.println(hexHashCode);
//
//        int hashCode = Integer.parseUnsignedInt(hexHashCode, 16);
//
//        System.out.println(hashCode);
//        System.out.println(bird.hashCode());
//        System.out.println(bird.toString());

        // Manual overriding
//        Bird bird = new Bird();
//        bird.age = 15;
//        bird.name = "Ворона";
//
//        System.out.println(bird);
        // Idea implementation

        // FIX EXAMPLE WITH Cards!!!!
//
        String a = "abc";
        String b = new String("abc").intern();

        System.out.println(a == b);

    }
}
