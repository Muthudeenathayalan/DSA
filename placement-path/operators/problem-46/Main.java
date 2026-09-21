import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int re = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int re1= (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.print((a+b+c)-re-re1);
    }
}
