import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> lol = new ArrayList<>();
        for (int i = 1; i <=1000; i++) {
            lol.add(i);
        }
        for (int j = 0; j <= 10; j++) {
            System.out.println(lol.get(lol.size() / 2));
            switch (scn.nextLine()) {
                case "correct":
                    System.exit(0);
                case "lower":
                    lol = lol.subList(0, lol.size() / 2);
                    break;
                case "higher":
                    lol = lol.subList(lol.size() / 2, lol.size());
                    break;
            }
        }
    }
}
