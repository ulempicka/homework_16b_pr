package cards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestCards {
    public static void main(String[] args) {
        SetPerColor setPerColor = new SetPerColor(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10},new String[]{"walet", "dama", "król", "as"});
        Map<Colors,SetPerColor> setAllColors = new HashMap();
        for (Colors color : Colors.values()){
            setAllColors.put(color,setPerColor);
        }

        for (Colors color : setAllColors.keySet()){
            System.out.println(color + " karty: " + setAllColors.get(color));
        }


        System.out.println("Podaj jezyk PL / EN");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        List<Colors> translateColors = Colors.translate(userChoice);
        System.out.println(translateColors);
    }
}
