package com.object.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Cloneable {

    int age;
    String name;
    Person owner;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }

// Simple clone. Class should implement Cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep clone. Class should implement Cloneable interface
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Dog dog = new Dog(this.age, this.name);
//        Person person = new Person(this.owner.name);
//        dog.owner = person;
//
//        return dog;
//    }


    // Stream clone. Class should implement Serializable interface
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        try {
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            ObjectOutputStream oos = new ObjectOutputStream(baos);
//            oos.writeObject(this);
//
//            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//            ObjectInputStream ois = new ObjectInputStream(bais);
//            return ois.readObject();
//        } catch (IOException e) {
//            return null;
//        } catch (ClassNotFoundException e) {
//            return null;
//        }
//    }

    public static void main(String[] args) {
        Dog dog = new Dog(5, "Richi");
        dog.owner = new Person("Vasja");

        Dog clonedDog = null;
        try {
            clonedDog = (Dog) dog.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(dog);
        System.out.println(clonedDog);

        clonedDog.name = "Lola";
        clonedDog.owner.name = "Petja";

        System.out.println(dog);
        System.out.println(clonedDog);

    }

}
