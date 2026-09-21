import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input described in the problem.
        // Write your approach here, then print only the answer.
        int n=input.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}
