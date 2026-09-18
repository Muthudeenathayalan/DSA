import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt(); // x
        int b = input.nextInt(); // y
        int c = input.nextInt(); // dx
        int d = input.nextInt(); // dy
        
        int newX = a + c;
        int newY = b + d;
        int squaredDist = (newX * newX) + (newY * newY);
        
        System.out.print(newX + " " + newY + " " + squaredDist);
    }
}
