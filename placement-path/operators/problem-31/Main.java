import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt(); // l
        int b = input.nextInt(); // r
        int c = input.nextInt(); // d
        
        // Pure arithmetic with no if-statements
        System.out.print((b / c) - (a + c - 1) / c + 1);
        
        input.close();
    }
}
