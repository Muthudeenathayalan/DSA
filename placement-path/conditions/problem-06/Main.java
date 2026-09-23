import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        if(b==1){
            System.out.print("100");
        }
        else if(a==500 || a>500){
            System.out.print("0");
        }
        else if(a<500){
            System.out.print("50");
        }
    }
}
