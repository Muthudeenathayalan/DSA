import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int o=input.nextInt();
        int t=input.nextInt();
        int c=input.nextInt();
        if(o>=10 && (t<=5 || c==1)){
            System.out.print("FREE");
        }
        else{
            System.out.print("PAID");
        }
    }
}
