package cardsVersion2;

public enum Color {

    TREFL("żołądź", "clubs"),
    KARO("dzwonek", "diamonds"),
    KIER("serce", "hearts"),
    PIK("wino", "spades");

    private final String polishDescription;
    private final String englishDescription;

    Color(String polishDescription, String englishDescription) {
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;
    }

    public String getPolishDescription() {
        return polishDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }
}
