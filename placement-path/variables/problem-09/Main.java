import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int s1=a*c;
        int s2=b*d;
        int t1=c+d;
        double t2=(double)(s1+s2)/t1;
        System.out.print(t2);
    }
}
