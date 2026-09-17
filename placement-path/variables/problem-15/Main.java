import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       long a = input.nextLong();
        long sum = 0;
        
        // Loop to extract and add each digit
        while (a > 0) {
            sum += a % 10; // Get the last digit
            a /= 10;       // Remove the last digit
        }
        
        System.out.print(sum);
    }
}
