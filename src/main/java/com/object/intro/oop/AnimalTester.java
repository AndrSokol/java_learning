package com.object.intro.oop;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Cow cow = new Cow();

//        System.out.println(animal);

//        animal.voice();
//        cat.voice();
//        dog.voice();
//        cow.voice();

//        cat.bite();
//        dog.bite();
//
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(animal);
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(cow);
//
//
//        for (Animal a : animals){
//            if (a.getClass().equals(Animal.class)) {
//                  System.out.print("Какая-то логика с котами. ");
//                }
//            a.voice();
//        }

        // - Reflection
//        System.out.println(animal.toString());
//        Method[] declaredMethods = animal.getClass().getDeclaredMethods();
//        for (int i = 0; i < declaredMethods.length; i++) {
//            System.out.println(declaredMethods[i]);
//        }

//        for (Animal a : animals){
//            if (a instanceof Hunter) {
//                ((Hunter) a).bite();
//                System.out.print("Какая-то логика с котами. ");
//            }
//            a.voice();
//        }

//
//        List<Hunter> hunters = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//
//        for (Hunter hunter: hunters) {
//            hunter.bite();
//        }

        // Где используется getClass?
//        System.out.println(animal);
        // - в toString
//                for (Animal a : animals){
//                    System.out.println(a.toString());
//                }

        // - можно накрутить логику, связанную с определенным классом
//        for (Animal a : animals){
//            if (a.getClass().equals(Cat.class)) {
//                  System.out.print("Какая-то логика с котами. ");
//                }
//            a.voice();
//        }

        // аналог с проверкой всего дерева иерархии - instanceof
//        for (Animal a : animals){
//            if (a instanceof Cat) {
//                System.out.print("Какая-то логика с котами. ");
//            }
//            a.voice();
//        }

        // - Reflection
//        System.out.println(animal.toString());
//        Method[] declaredMethods = animal.getClass().getDeclaredMethods();
//        for (int i = 0; i < declaredMethods.length; i++) {
//            System.out.println(declaredMethods[i]);
//        }
    }
}





