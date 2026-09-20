import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read the inputs n and k
        int n = input.nextInt();
        int k = input.nextInt();
        
        // Use bitwise OR and left-shift to force the k-th bit to 1
        int result = n | (1 << k);
        
        // Print the final answer
        System.out.print(result);
        
        input.close();
    }
}
