package cardsVersion2;

import java.util.ArrayList;
import java.util.List;

public class Card {
    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";
    private Colors colors;
    private Figures figures;

    public Card(Colors colors, Figures figures) {
        this.colors = colors;
        this.figures = figures;
    }

    public Card() {
    }

    public List<Card> createCards() {
        List<Card> setOfCards = new ArrayList<>();

        for (Colors c : colors.values()) {
            for (Figures f : figures.values()) {
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
                    System.out.println(card.colors.getPolishDescription() + " : " + card.figures.getPolishDescription());
                }
                break;
            case ENGLISH:
                System.out.println("Set contains cards:");
                for (Card card : setOfCards) {
                    System.out.println(card.colors.getEnglishDescription() + " of " + card.figures.getEnglishDescription());
                }
                break;
            default:
                throw new IllegalArgumentException("nieprawidlowy kod jezyka");
        }
    }
}
