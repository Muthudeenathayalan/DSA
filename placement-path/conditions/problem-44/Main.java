import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int e=c+b;
        if(e<=a){
            System.out.print("BOTH");
        }
        else if( c<=a||b<=a ){
            System.out.print("ONE");
        }
        else{
            System.out.print("NONE");
        }
    }
}
