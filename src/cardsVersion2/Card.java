package cardsVersion2;

import java.util.ArrayList;
import java.util.List;

public class Card {
    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";
    private Color color;
    private Figure figure;

    public Card(Color color, Figure figure) {
        this.color = color;
        this.figure = figure;
    }

    public Card() {
    }

    public List<Card> createCards() {
        List<Card> setOfCards = new ArrayList<>();

        for (Color c : color.values()) {
            for (Figure f : figure.values()) {
                setOfCards.add(new Card(c, f));
            }
        }
        return setOfCards;
    }

    public void translate(List<Card> setOfCards, String language) {
        switch (language) {
            case POLISH:
                System.out.println("Poszczególne karty w zestawie");
                for (Card card : setOfCards) {
                    System.out.println(card.color.getPolishDescription() + " : " + card.figure.getPolishDescription());
                }
                break;
            case ENGLISH:
                System.out.println("Set contains cards:");
                for (Card card : setOfCards) {
                    System.out.println(card.color.getEnglishDescription() + " of " + card.figure.getEnglishDescription());
                }
                break;
            default:
                throw new IllegalArgumentException("nieprawidlowy kod jezyka");
        }
    }
}
