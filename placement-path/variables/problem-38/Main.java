import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();
        int a1=(d-a);
        int a2=(e-b);
        int a3=(f-c);
        System.out.print((a1*a1)+(a2*a2)+(a3*a3));
    }
}
