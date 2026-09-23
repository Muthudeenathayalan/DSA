import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if((a+b)>c){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
