import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        if(a%400==0){
            System.out.print("CENTURY_LEAP");
        }
        else if(a%100==0){
            System.out.print("CENTURY_COMMON");
        }
        else{
            System.out.print("ORDINARY");
        }
    }
}
