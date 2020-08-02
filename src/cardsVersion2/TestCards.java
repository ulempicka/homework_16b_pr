package cardsVersion2;

import java.util.Map;
import java.util.Scanner;

public class TestCards {
    public static void main(String[] args) {

        System.out.println("Podaj jezyk PL / EN");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        Card card = new Card();
        Map<String, String> setTranslated = card.translate(userChoice);

//        showCardsPerColor(setTranslated);
        showAllCards(setTranslated, userChoice);
    }

//    private static void showCardsPerColor(Map<String, String> setTranslated) {
//        for (String color : setTranslated.keySet()) {
//            System.out.println(color + " : " + setTranslated.get(color));
//        }
//        System.out.println("--------------------------------------------");
//    }

    private static void showAllCards(Map<String, String> setTranslated, String language) {
        switch (language) {
            case "PL": {
                System.out.println("Poszczególne karty w zestawie");
                for (String color : setTranslated.keySet()) {
                        System.out.println(color + " " + setTranslated.get(color));
                    }
                    System.out.println("--------------------------------------------");
                break;
            }
            case "EN": {
                System.out.println("Set contains cards:");
                for (String color : setTranslated.keySet()) {
                    System.out.println(color + " " + setTranslated.get(color));
                }
                System.out.println("--------------------------------------------");
                break;
            }
            default:
                throw new IllegalArgumentException("nieprawidlowy kod jezyka");
        }
    }
}
