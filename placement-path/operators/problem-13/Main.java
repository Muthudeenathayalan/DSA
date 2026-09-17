import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int h=a/3600;
        int j=a%3600;
        int m=j/60;
        int n=j%60;
        System.out.print(h+" "+m+" "+n);
    }
}
