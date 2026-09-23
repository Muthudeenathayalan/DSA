import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=b+2;
        if( b==0 || b%5!=0){
            System.out.print("INVALID");
        }
        else if(c>a){
            System.out.print("INSUFFICIENT");
        }
        else{
            System.out.print("OK");
        }
    }
}
