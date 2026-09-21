import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int i=input.nextInt();
        int k=input.nextInt();
        int result = ((i - (k % n)) + n) % n;
        System.out.print(result);
    }
}
