package com.object.equalshashcode;

import java.util.Objects;

public class Elephant {
    int age;
    String name;

    public Elephant(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return age == elephant.age &&
                Objects.equals(name, elephant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
