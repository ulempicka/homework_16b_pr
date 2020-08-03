package cardsVersion2;

public enum Figure {
    TWO("dwójka", "two"),
    THREE("trójka", "three"),
    FOUR("czwórka", "four"),
    FIVE("piątka", "five"),
    SIX("szóstka", "six"),
    SEVEN("siódemka", "seven"),
    EIGHT("ósemka", "eight"),
    NINE("dziewiątka", "nine"),
    TEN("dziesiątka", "ten"),
    JACK("walet", "jack"),
    QUEEN("dama", "queen"),
    KING("król", "king"),
    ACE("as", "ace");

    private final String polishDescription;
    private final String englishDescription;

    Figure(String polishDescription, String englishDescription) {
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
