import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input described in the problem.
        // Write your approach here, then print only the answer.
        int a=input.nextInt();
        if(a<0){
            System.out.print("negative");
        }
        if(a>0){
            System.out.print("positive");
        }
        if(a==0){
            System.out.print("zero");
        }
    }
}
