package com.exceptions.coffeExample;

public class CoffeeMachineDoesntWorkException extends Exception{
    public CoffeeMachineDoesntWorkException(String message) {
        super(message);
    }
}
