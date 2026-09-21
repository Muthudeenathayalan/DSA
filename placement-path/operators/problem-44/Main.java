import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int f=(a/b)*c;
        int f2=((a+b-1)/b)*c;
        System.out.print(f+" "+f2);
    }
}
