import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.nextLine();
        String abc = scn.nextLine().toLowerCase();
        for (int i = 0; i <= 2 ; i++) {
            if (abc.charAt(i) == 'a') System.out.print(Math.min(Math.min(a, b), c) + " ");
            if (abc.charAt(i) == 'b') System.out.print(Math.max(Math.min(a, b), c) + " ");
            if (abc.charAt(i) == 'c') System.out.print(Math.max(Math.max(a, b), c) + " ");
        }
    }
}
