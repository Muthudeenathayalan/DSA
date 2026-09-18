import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int a1=(a*b);
        int result=(a==0?0:(a1+c-1)/c);
        System.out.print(result);
    }
}
