package com.object.intro.problem;

import java.util.Objects;

public class Card {
    String name;
    int age;
    String phone;

    public Card(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

//    @Override
//    public String toString() {
//        return "Card{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
//
//        @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Card card = (Card) o;
//        return age == card.age &&
//                Objects.equals(name, card.name) &&
//                Objects.equals(phone, card.phone);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, phone);
//    }


}
