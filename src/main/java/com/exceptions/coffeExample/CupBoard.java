package com.exceptions.coffeExample;

public class CupBoard {
    private String coffeeBeans = "Арабика 100%";
//    private String coffeeBeans = null;
    public String getCoffee() throws CoffeeNotFoundException
    {
        System.out.println("Достаю кофе из шкафа...");
        if(coffeeBeans == null){
            throw new CoffeeNotFoundException("Контейнер с кофе пустой");
        }
        return coffeeBeans;
    }
}
