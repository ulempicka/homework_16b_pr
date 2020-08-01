package cards;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class TestCards {
    public static void main(String[] args) {

        System.out.println("Podaj jezyk PL / EN");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        Map<String, String[]> setTranslated = Colors.translate(userChoice);

        showCardsPerColor(setTranslated);
        showAllCards(setTranslated, userChoice);
    }

    private static void showCardsPerColor(Map<String, String[]> setTranslated) {
        for (String color : setTranslated.keySet()) {
            System.out.println(color + " : " + Arrays.toString(setTranslated.get(color)));
        }
        System.out.println("--------------------------------------------");
    }

    private static void showAllCards(Map<String, String[]> setTranslated, String language) {
        switch (language) {
            case "PL": {
                System.out.println("Poszczególne karty w zestawie");
                for (String color : setTranslated.keySet()) {
                    for (int i = 0; i < setTranslated.get(color).length; i++) {
                        System.out.println(setTranslated.get(color)[i] + " " + color);
                    }
                    System.out.println("--------------------------------------------");
                }
                break;
            }
            case "EN": {
                System.out.println("Set contains cards:");
                for (String color : setTranslated.keySet()) {
                    for (int i = 0; i < setTranslated.get(color).length; i++) {
                        System.out.println(setTranslated.get(color)[i] + " of " + color);
                    }
                    System.out.println("--------------------------------------------");
                }
                break;
            }
            default:
                throw new IllegalArgumentException("nieprawidlowy kod jezyka");
        }
    }
}
