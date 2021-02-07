package com.exceptions.coffeExample;

public class SmallCoffeeMachineDoesntWorkException extends CoffeeMachineDoesntWorkException {
    public SmallCoffeeMachineDoesntWorkException(String message) {
        super(message);
    }
}
