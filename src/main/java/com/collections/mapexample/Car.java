package com.collections.mapexample;

import java.util.Objects;

public class Car {
    private CarMakerEnum maker;
    private ColorEnum color;
    private int year;

    public Car(CarMakerEnum maker, ColorEnum color, int year) {
        this.maker = maker;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker=" + maker +
                ", color=" + color +
                ", year=" + year +
                '}';
    }

    public CarMakerEnum getMaker() {
        return maker;
    }

    public void setMaker(CarMakerEnum maker) {
        this.maker = maker;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                maker == car.maker &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maker, color, year);
    }
}
