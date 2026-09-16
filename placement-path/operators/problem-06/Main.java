import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        long a=input.nextInt();
        long b=input.nextInt();
        long sum=(b-a+1)*(a+b)/2;
        System.out.print(sum);
    }
}
