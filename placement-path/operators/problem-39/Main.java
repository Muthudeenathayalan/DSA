import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double s=(a*b)/100.0;
        double result=((s<c)?(a-s):(a-s));
        System.out.print(result);
    }
}
