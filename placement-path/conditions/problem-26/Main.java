import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a<=0 ||b<=0 || c<=0 || a+b<=c || b+c<=a || c+a<=b ){
            System.out.print("INVALID");
        }
        else if(a==b && b==c){
            System.out.print("EQUILATERAL");
        }
        else if(a==b || b==c || c==a){
            System.out.print("ISOSCELES");
        }
        else{
            System.out.print("SCALENE");
        }
    
    }
}
