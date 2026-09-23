import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read input for theory (t) and lab (l)
        int a = input.nextInt(); // theory score
        int b = input.nextInt(); // lab score
        
        // All three conditions must be true using the && (AND) operator
        if (a >= 40 && b >= 50 && (a + b) >= 110) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
