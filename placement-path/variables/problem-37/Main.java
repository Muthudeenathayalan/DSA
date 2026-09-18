import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int b = input.nextInt();
        int r = input.nextInt();
        int h = input.nextInt();
        
        int result = (b == 0 ? 0 : b / (r + h));
        int unused = (b == 0 ? 0 : b % (r + h));
        
        System.out.print(result + " " + unused);
    }
}
