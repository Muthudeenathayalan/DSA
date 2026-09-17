import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int c=input.nextInt();
        int u=input.nextInt();
        int a=input.nextInt();
        System.out.print((c-u)*1024-a);
    }
}
