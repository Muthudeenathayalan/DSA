import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            sum+=(i+1)*arr[i];
        }
        System.out.print(sum);
    }
}
