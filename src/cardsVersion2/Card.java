package cardsVersion2;

import java.util.Map;
import java.util.TreeMap;

public class Card {
    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";
//    private String color;       //czy enum
//    private String figure;
    private Colors colors;
    private Figures figures;
//
//    public Card(String color, String figure) {
//        this.color = color;
//        this.figure = figure;
//    }

    public Map<String, String> translate(String language) {
        Map<String, String> setOfCards = new TreeMap<>();
        switch (language) {
            case POLISH:
                for (Colors c : colors.values()) {
                    for (Figures f : figures.values()) {
                        setOfCards.put(c.getPolishDescription(), figures.getPolishDescription());
                    }
                }
                break;
            case ENGLISH:
                for (Colors c : colors.values()) {
                    for (Figures f : figures.values()) {
                    setOfCards.put(c.getEnglishDescription(),figures.getEnglishDescription());
                }}
                break;
            default:
                throw new IllegalArgumentException("nieprawidlowy kod jezyka");
        }

        return setOfCards;
    }

//    public Card translateCard(String language, String color, String figure) {
//        switch (language) {
//            case POLISH:
//                    Card card = new Card((color.getPolishDescription(),figures.getPolishDescription());
//                }
//                break;
//            case ENGLISH:
//                for (Colors c : colors.values()) {
//                    setOfCards.put(c.getEnglishDescription(),figures.getEnglishDescription());
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("nieprawidlowy kod jezyka");
//        }
//
//        return setOfCards;
//    }
}
