import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int f = input.nextInt();
        int v = input.nextInt();
        
        // 1. Check the lock rule first (regardless of v)
        if (f >= 3) {
            System.out.print("LOCKED");
        } 
        // 2. Otherwise (f < 3), check if password is correct
        else if (v == 1) {
            System.out.print("ALLOW");
        } 
        // 3. If password is wrong and f < 3
        else {
            System.out.print("DENY");
        }
    }
}
