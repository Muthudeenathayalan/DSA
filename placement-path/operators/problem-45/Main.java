import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int r1=(a/b)*c;
        int r2=((a*c)/b);
        System.out.print(r1+" "+r2);
    }
}
