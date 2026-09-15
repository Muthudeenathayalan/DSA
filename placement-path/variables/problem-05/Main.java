import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int t=input.nextInt();
        int h=t/(60*60);
        int r=t%(60*60);
        int m=r/60;
        int s=r%60;
        System.out.print(h+" "+m+" "+s);
        
    }
}
