import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        if(a%3==0 && a%5==0){
            System.out.print("BOTH");
        }
        else if(a%3==0){
            System.out.print("THREE");
        }
        else if(a%5==0){
            System.out.print("FIVE");
        }
        else{
            System.out.print("OTHER");
        }
    }
}
