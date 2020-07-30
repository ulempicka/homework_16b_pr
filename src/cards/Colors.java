package cards;

import java.util.ArrayList;
import java.util.List;

public enum Colors {
    TREFL("żołądź", "clubs"),
    KARO("dzwonek", "diamonds"),
    KIER("serce", "hearts"),
    PIK("wino", "spades");

    private final String polish;
    private final String english;
    public static final String POLISH = "PL";
    public static final String ENGLISH = "EN";

    Colors(String polish, String english) {
        this.polish = polish;
        this.english = english;
    }

    public String getPolish() {
        return polish;
    }

    public String getEnglish() {
        return english;
    }

    public static List<Colors> translate(String language) {
        List<Colors> colors = new ArrayList<>();
        for (Colors c : values()) {
            switch (language) {
                case POLISH:
                    colors.add(Colors.valueOf(c.getPolish()));
                    break;
                case ENGLISH:
                    colors.add(Colors.valueOf(c.getEnglish()));
                    break;
                default:
                    throw new IllegalArgumentException("nieprawidlowy kod jezyka");
            }
        }
        return colors;
    }
}
