import java.util.Scanner;
import java.util.Stack;

public class Dijkstra {
    static final int modulo = 1000000007;

    public static void main(String[] args) {

        Stack<String> ops = new Stack<>();
        Stack<Long> vals = new Stack<>();
        Scanner scn = new Scanner(System.in);
        String sondre = scn.nextLine();

        for (String token : sondre.split( " ")) {
            switch (token) {
                case "(":
                    continue;
                case "sqr":
                    ops.push(token);
                    break;
                case "add":
                    ops.push(token);
                    break;
                case "min":
                    ops.push(token);
                    break;
                case ",":
                    continue;
                case ")":

                    switch (ops.pop()) {
                        case "sqr":
                            long xD = vals.pop();
                            vals.push((xD * xD)% modulo);
                            break;
                        case "add":
                            vals.push((vals.pop() + vals.pop()) % modulo);
                            break;
                        case "min":
                            vals.push(min(vals.pop(), vals.pop(), vals.pop()));
                            break;
                    }
                    break;
                default:
                    vals.push(Long.parseLong(token));
                    break;
            }

        }
        System.out.println(vals.pop());
    }
    public static long min (long x, long y, long z) { return (Math.min(z, Math.min(x, y))) % modulo; }
}
// min ( add ( 1000000000 , 7 ) , sqr ( sqr ( 2 ) ) , 1 )