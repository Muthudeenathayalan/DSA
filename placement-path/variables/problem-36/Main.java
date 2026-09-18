import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int d=input.nextInt();
        int v=input.nextInt();
        System.out.print((n-d)+" "+((n-d)*v));
    }
}
