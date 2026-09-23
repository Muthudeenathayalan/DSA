import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int s=input.nextInt();
        int q=input.nextInt();
        int h=input.nextInt();
        if(q<=s && h<=16){
            System.out.print("READY");
        }
        else if(q<=s){
            System.out.print("TOMORROW");
        }
        else{
            System.out.print("BACKORDER");
        }
    }
}
