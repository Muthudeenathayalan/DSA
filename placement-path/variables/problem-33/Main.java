import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the input, implement your approach, and print the answer.
        int p=input.nextInt();
        int u=input.nextInt();
        int r=input.nextInt();
        int pa=(p==0?0:p==u?0:p-(u+r));
        System.out.print(pa);
    }
}
