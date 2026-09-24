import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=a-b;
        int f=c-d;
        if(e==f){
            System.out.print("BORDER");
        }
        else if(e>f || f>e){
            System.out.print("OUTSIDE");
        }
        else{
            System.out.print("INSIDE");
        }
    }
}
