import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int arr[] = new int[n];
        if(n==0) System.out.print("EMPTY");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;            
                }
            }
        
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
