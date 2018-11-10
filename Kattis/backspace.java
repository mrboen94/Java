import java.util.Scanner;

public class backspace {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) != '<') {
                output.append(input.charAt(i));
            }
            if (input.charAt(i) == '<') {
                output.deleteCharAt(output.length()-1);
            }
        }
        System.out.println(output);
    }
}