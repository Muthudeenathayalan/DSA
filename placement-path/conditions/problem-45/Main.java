import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=a*b;
        int max=Math.max(5,d);
        int mix=Math.min(c,max);
        System.out.print(mix);
    }
}
