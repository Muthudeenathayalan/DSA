import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        int arr[]=new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            if(i%2==0){
                sum1+=arr[i];
            }
            if(i%2!=0){
                arr[i]=arr[i]*-1;
                sum2+=arr[i];
            }
        }
        System.out.print(sum1+sum2);
    
    }
}
