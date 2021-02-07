package com.exceptions.coffeExample;

public class CoffeeTester {
    public static void main(String[] args) {
        System.out.println("Доброе утро! Пора выпить кофе...");

        CupBoard wordrobe = new CupBoard();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        try {
            String coffee = wordrobe.getCoffee();
            System.out.println("Кофе достал");
            coffeeMachine.prepareCoffee(coffee);
            System.out.println("Кофе приготовил");
            System.out.println("[Выпить кофе дома]");
        } catch (CoffeeNotFoundException e) {
            System.out.println("Ой, я забыл купить кофе. Пойду в кафе.");
            System.out.println("[Пойти выпить кофе в кафе]");
        } catch (SmallCoffeeMachineDoesntWorkException e) {
            System.out.println("Что-то сломалось в кофемашине. Надо позвонить мастеру по кофемашинам");;
            System.out.println("[Пойти выпить кофе в кафе]");
            // long[] l = new long[Integer.MAX_VALUE]; -- Produce OOM
        } finally {
            System.out.println("Я снова полон энергии!");
        }

        System.out.println("Утро удалось!");
    }
}
