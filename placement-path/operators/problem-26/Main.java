import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=(a/10)%10;
        int c=a%10;
        System.out.print(b+" "+c);
    }
}
