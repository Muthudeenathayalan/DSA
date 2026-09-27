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
        int arr[]=new int[n];
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            
        }
        int j=0;
        for(int i=0;i<n;i++){        
            if(arr[i]!=0){
                res[j]=arr[i];
                j++;   
            } 
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        
    }
}
