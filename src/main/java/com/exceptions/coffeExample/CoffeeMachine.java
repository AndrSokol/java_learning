package com.exceptions.coffeExample;

public class CoffeeMachine {
//    private boolean isWork = true;
    private boolean isWork = false;
    public void prepareCoffee(String coffeeBeans) throws SmallCoffeeMachineDoesntWorkException
    {
        System.out.println("Начинаю готовить кофе...");
        if(isWork){
            System.out.println("Приготовить кофе из " + coffeeBeans);
        } else {
            throw new SmallCoffeeMachineDoesntWorkException("Кофе машина не включается");
        }
    }
}
