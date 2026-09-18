import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        double c=a*1.0/b;
        double d=(a==0)?0:(b*1000)/(a*60.0);
        System.out.print(c+" "+d);
    }
}
