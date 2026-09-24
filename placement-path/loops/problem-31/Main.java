import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int n=input.nextInt();
        if(n==0){
            System.out.print("0");
            return;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            int num=input.nextInt();
            if(num==0) {
                System.out.print(i);
                return;
            }
        }
        System.out.print("0");
    }
}
