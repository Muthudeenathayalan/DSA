import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=(3*a)+(b)-(2*c);
        if(d>=10) System.out.print(d+" "+"1");
        else System.out.print(d+" "+"0");
    }
}
