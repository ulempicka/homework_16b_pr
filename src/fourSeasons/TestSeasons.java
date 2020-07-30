package fourSeasons;

import java.util.Scanner;

public class TestSeasons {
    public static void main(String[] args) {

        String userChoice = readSeasonFromUserInPolish();
        displayMonths(userChoice);
    }

    private static String readSeasonFromUserInPolish() {
        System.out.print("Dostepne pory roku: ");
        for (Season season : Season.values()) {
            System.out.print(season.getPolish() + " ");
        }
        System.out.println("\nPodaj pore roku ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void displayMonths(String polishSeason) {
        Season val = Season.polishToVal(polishSeason);
        System.out.println(polishSeason + " to: " + val);
    }
}
