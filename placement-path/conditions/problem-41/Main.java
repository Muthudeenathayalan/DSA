import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int o=input.nextInt();
        int t=input.nextInt();
        int c=input.nextInt();
        if(o<90 || t>=40){
            System.out.print("CRITICAL");
        }
        else if(o<95 || c>=3){
            System.out.print("WATCH");
        }
        else{
            System.out.print("NORMAL");
        }
    }
}
