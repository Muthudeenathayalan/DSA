import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int num = input.nextInt();
            if (i % 2 != 0) { // Check for odd index positions
                sum += num;
            }
        }
        
        // Print the sum INSIDE the main method
        System.out.print(sum); 
    } // Closes main method
} // Closes Main class
