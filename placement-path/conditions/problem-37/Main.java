import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int u=input.nextInt();
        int l=input.nextInt();
        int d=input.nextInt();
        if(n>=8 && l>0 && u>0 && d>0){
            System.out.print("STRONG");
        } 
        else if(n>=6 && d>0 ){
            System.out.print("MEDIUM");
        }
        else{
            System.out.print("WEAK");
        }
    }
}
