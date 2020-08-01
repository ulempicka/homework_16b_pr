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

        for (String color : setTranslated.keySet()) {
            System.out.println(color + " karty: " + Arrays.toString(setTranslated.get(color)));
        }

        System.out.println("Poszczególne karty");
        for (String color : setTranslated.keySet()) {
            for (int i = 0; i < setTranslated.keySet().size(); i++) {
                System.out.println(setTranslated.get(color)[i] + " " + color);
            }
        }
    }
}
