import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int y1=input.nextInt();
        int m1=input.nextInt();
        int y2=input.nextInt();
        int m2=input.nextInt();
        int y11=(y1*12)+m1;
        int y12=(y2*12)+m2;
        int result=(y11>y12?y11-y12:y12-y11);
        System.out.print(result);
    }
}
