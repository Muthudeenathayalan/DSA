import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int s=(a*d)-(b*c);
        int r=(((a*d)-(b*c))==0?1:0);
        System.out.print(s+" "+r);
    }
}
