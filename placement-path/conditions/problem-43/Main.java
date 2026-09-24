import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int o = input.nextInt();
        int t = input.nextInt(); 
        int c = input.nextInt(); 
        
        int max = (t > c) ? t : c;
        int min = (t < c) ? t : c;
        
        int clamped = (o < min) ? min : (o > max) ? max : o;

        int adjustment = clamped - o;
        
        System.out.print(clamped + " " + adjustment);
    }
}
