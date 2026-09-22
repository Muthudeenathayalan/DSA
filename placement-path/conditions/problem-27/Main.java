import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        if(a==0 && b==0){
            System.out.print("ORIGIN");
        }
        else if(a==0){
            System.out.print("Y_AXIS");
        }
        else if(b==0){
            System.out.print("X_AXIS");
        }
        else{
            System.out.print("QUADRANT_1");
        }
    }
}
