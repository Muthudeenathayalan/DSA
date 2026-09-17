import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        String result=((a>=90)?"A":(a>=70)?"B":(a>=50)?"C":"F");
        System.out.print(result);
        
    }
}
