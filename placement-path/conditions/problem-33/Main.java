import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int start = Math.max(a, c);
        int end = Math.min(b, d);
        if (start > end) {
            System.out.print("NONE");
        } else if (start == end) {
            System.out.print("TOUCH");
        } else {
            System.out.print("OVERLAP");
        }
    }
}
