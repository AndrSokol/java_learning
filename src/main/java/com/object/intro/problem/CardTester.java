package com.object.intro.problem;

import java.util.ArrayList;
import java.util.List;

public class CardTester {
    public static void main(String[] args) {

        // GIVEN
        Card expectedCard = new Card("Vasja", 30, "12345");

        // WHEN
        List<Card> actualCards = getActualCards();

        // THEN
        boolean result = actualCards.contains(expectedCard);

        System.out.println(result);
        System.out.println(actualCards);
    }

    public static List<Card> getActualCards(){
        List<Card> actualCards = new ArrayList<>();
        actualCards.add(new Card("Vasja", 30, "12345"));
        actualCards.add(new Card("Petja", 25, "99999"));

        return actualCards;
    }
}
