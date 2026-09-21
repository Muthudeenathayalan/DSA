import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        long a=input.nextLong();
        int count=0;
        do{
            count++;
            a=a/10;
        }while(a>0);
        System.out.print(count);
    }
}
