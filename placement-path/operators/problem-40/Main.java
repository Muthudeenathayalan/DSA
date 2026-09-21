import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int rev=((a%10)*100)+(a/10);
        System.out.print(rev);
    }
}
