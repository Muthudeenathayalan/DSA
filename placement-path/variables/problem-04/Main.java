import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        long a=input.nextInt();
        long b=input.nextInt();
        long ar=a*b;
        long pr=2*(a+b);
        System.out.print(ar+" "+pr);
    }
}
