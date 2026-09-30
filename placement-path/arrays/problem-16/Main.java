import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the number of days
        if (!input.hasNextInt()) return;
        int n = input.nextInt();
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Process each price one by one
        for (int i = 0; i < n; i++) {
            int price = input.nextInt();
            
            if (price < minPrice) {
                minPrice = price; // Update the minimum buying price
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit; // Update the maximum profit found so far
                }
            }
        }
        
        // Print the final result
        System.out.println(maxProfit);
    }
}
