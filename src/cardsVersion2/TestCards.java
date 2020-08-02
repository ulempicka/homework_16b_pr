package cardsVersion2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestCards {
    public static void main(String[] args) {

        System.out.println("Podaj jezyk PL / EN");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        Card card = new Card();
        List<Card> setOfCards = card.createCards();
        card.translate(setOfCards,userChoice);
    }
}
