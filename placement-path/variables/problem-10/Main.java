import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int p=input.nextInt();
        int d=input.nextInt();
        int t=input.nextInt();
        double a=(p*d)/100.0;
        double b=p-a;
        double c=(b*t)/100.0;
        double e=b+c;
        System.out.print(e);
    }
}
