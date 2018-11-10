import java.util.Scanner;

public class Oddball {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int loops = scn.nextInt();
        int loopCounter = 0;
        while (loops != loopCounter) {
            isEven(scn.nextInt());
            loopCounter++;
        }
    }

    public static void isEven(int i) {
        if (i % 2 == 0)
            System.out.println(i + " is even");
        else
            System.out.println(i + " is odd");
    }
}
