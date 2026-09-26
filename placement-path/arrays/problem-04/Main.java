import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        if(n==0 || n==1){
            System.out.print("NONE");
            return;
        }
        int arr[]=new int[n];
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int selar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<largest && arr[i]>selar){
                selar=arr[i];
            }
        }
        if(selar==Integer.MIN_VALUE){
            System.out.print("NONE");
            return;
        }
        System.out.print(selar);
        
    }
}
