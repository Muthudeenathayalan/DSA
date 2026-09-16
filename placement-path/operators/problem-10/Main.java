import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double d=(a*b)/100.0;
        double e=a-d;
        double f=(e*c)/100.0;
        System.out.print(e+f);
    }
}
