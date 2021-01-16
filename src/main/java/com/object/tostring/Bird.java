package com.object.tostring;

public class Bird {
    String name;
    int age;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
