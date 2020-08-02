package cardsVersion2;

public enum Colors {

    TREFL("żołądź", "clubs"),
    KARO("dzwonek", "diamonds"),
    KIER("serce", "hearts"),
    PIK("wino", "spades");

    private final String polishDescription;
    private final String englishDescription;
//    private final String[] polishFigures;
//    private final String[] englishFigures;

    Colors(String polishDescription, String englishDescription) {
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;
//        this.polishFigures = new String[]{"dwójka","trójka","czwórka","piątka","szóstka","siódemka","ósemka","dziewiątka","dziesiątka","walet","dama","król","as"};
//        this.englishFigures = new String[]{"two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
    }

    public String getPolishDescription() {
        return polishDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }
}
