import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int arr[]=new int[n];
        int sunof=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        int rem=sunof-sum;
        System.out.print(rem);
    }
}
