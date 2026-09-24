import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        if(n==0){
            System.out.print("EMPTY");
            return;
        }
        int max=Integer.MAX_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            if(arr[i]<max) max=arr[i];
        }
        System.out.print(max);
    }
}
