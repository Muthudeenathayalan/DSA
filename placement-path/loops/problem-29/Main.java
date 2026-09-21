import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int a=input.nextInt();
        int n=0;
        for(int i=0;i<a;i++){
            int num=input.nextInt();
            if(num<0){
                n+=num;
            }
        }
        System.out.print(n*-1);
    }
}
