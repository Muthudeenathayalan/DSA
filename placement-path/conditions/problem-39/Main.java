import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int b=input.nextInt();
        if(a==2){
            if(b==1) System.out.print("29");
            else System.out.print("28");
        }
        else if(a<=7){
            if(a%2!=0) System.out.print("31");
            else System.out.print("30");
        }
        else if(a>7 && a<=12){
            if(a%2==0) System.out.print("31");
            else System.out.print("30");
        }
    }
}
