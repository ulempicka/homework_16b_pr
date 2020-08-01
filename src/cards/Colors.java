package cards;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public enum Colors {

    TREFL("żołądź", "clubs"),
    KARO("dzwonek", "diamonds"),
    KIER("serce", "hearts"),
    PIK("wino", "spades");

    private final String polishDescription;
    private final String englishDescription;
    private final String[] polishFigures;
    private final String[] englishFigures;
    private final String[] numberedCards;
    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";


    Colors(String polishDescription, String englishDescription) {
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;
        this.polishFigures = new String[]{"walet","dama","król","as"};
        this.englishFigures = new String[]{"jack","queen","king","ace"};
        this.numberedCards = new String[]{"2","3","4","5","6","7","8","9","10"};
    }

    public String getPolishDescr() {
        return polishDescription;
    }

    public String getEnglishDescr() {
        return englishDescription;
    }

    public String[] getPolishFigures() {
        return polishFigures;
    }

    public String[] getEnglishFigures() {
        return englishFigures;
    }

    public String[] getNumberedCards() {
        return numberedCards;
    }

    public static Map<String, String[]> translate(String language) {
        Map<String, String[]> setOfCards = new TreeMap<>();
            switch (language) {
                case POLISH:
                    for (Colors c : values()) {
                        setOfCards.put(c.getPolishDescr(),c.getPolishFigures());
                    }
                    break;
                case ENGLISH:
                    for (Colors c : values()) {
                        setOfCards.put(c.getEnglishDescr(),c.getEnglishFigures());
                    }
                    break;
                default:
                    throw new IllegalArgumentException("nieprawidlowy kod jezyka");
            }

        return setOfCards;
    }
}
