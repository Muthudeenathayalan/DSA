import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        // (a >> b) shifts the bits of 'a' to the right by 'b' places.
        // '& 1' performs a 'mod 2' check to get the last bit.
        int re = (a >> b) & 1;
        
        System.out.print(re);
        
        input.close();
    }
}
