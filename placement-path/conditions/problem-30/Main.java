import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        // Your calculation variables
        int d = a * 2;  // Used only when total units are 10 or less
        int b = a - 10; // Extra units beyond the first 10
        int c = b * 3;  // Cost for the extra units in slab 2
        int s = a - 20; // Extra units beyond the first 20
        int e = s * 5;  // Cost for the extra units in slab 3
        
        if (a <= 10) {
            System.out.print(d);
        } 
        else if (a > 10 && a <= 20) { // Fixed: changed 'a < 10' to 'a > 10'
            // The first 10 units cost exactly 20 (10 * 2), plus the remaining cost 'c'
            System.out.print(20 + c); 
        } 
        else {
            // First 10 cost 20, next 10 cost 30 (10 * 3), plus the remaining cost 'e'
            System.out.print(20 + 30 + e); 
        }
    }
}
