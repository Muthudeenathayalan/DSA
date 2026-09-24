import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input described in the problem.
        // Write your approach here, then print only the answer.
        int n=input.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
