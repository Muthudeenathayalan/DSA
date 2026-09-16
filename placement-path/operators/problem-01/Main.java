import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the three integer marks
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        // Calculate total
        int total = a + b + c;
        
        // Calculate mean (divide by 3.0 to preserve fractional part)
        double mean = total / 3.0;
        
        // Print total and mean separated by a space
        System.out.println(total + " " + mean);
        
        input.close();
    }
}
