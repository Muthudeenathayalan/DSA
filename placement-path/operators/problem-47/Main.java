import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int t=input.nextInt();
        int b=input.nextInt();
        int r1=(n+t-1)/t;
        int r2=(r1+b-1)/b;
        System.out.print(r1+" "+r2);
    }
}
