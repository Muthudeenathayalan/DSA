import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        if (a % 400 == 0) {
            System.out.print("true");
        } else if (a % 100 == 0) {
            System.out.print("false");
        } else if (a % 4 == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
