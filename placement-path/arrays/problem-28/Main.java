import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) count++;
        }
        System.out.print(count);
        
    }
}
