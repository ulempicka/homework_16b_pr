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
//    private final String[] numberedCards;
    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";


    Colors(String polishDescription, String englishDescription) {
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;
        this.polishFigures = new String[]{"dwójka","trójka","czwórka","piątka","szóstka","siódemka","ósemka","dziewiątka","dziesiątka","walet","dama","król","as"};
        this.englishFigures = new String[]{"two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
//        this.polishNumbers = new String[]{"dwójka","trójka","czwórka","piątka","szóstka","siódemka","ósemka","dziewiątka","dziesiątka"};
//        this.englishNumbers = new String[]{"two","three","four","five","six","seven","eight","nine","ten"};
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
