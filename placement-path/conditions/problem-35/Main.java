import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        if(a<5){
            System.out.print("0");
        }
        else if(a>5 && a<18 || a==5){
            if(b==1) System.out.print(8+3);
            else System.out.print("8");
        }
        else{
            if(b==1) System.out.print(12+3);
            else System.out.print("12");
        }
    }
}
