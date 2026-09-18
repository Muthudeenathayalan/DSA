import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read input variables in the specified order: w, h, b
        long w = input.nextLong();
        long h = input.nextLong();
        long b = input.nextLong();
        
        // Calculate the outer dimensions
        long outerW = w + 2 * b;
        long outerH = h + 2 * b;
        
        // Calculate outer perimeter and border area
        long outerPerimeter = 2 * (outerW + outerH);
        long borderArea = (outerW * outerH) - (w * h);
        
        // Print the result separated by a space
        System.out.println(outerPerimeter + " " + borderArea);
        
        input.close();
    }
}
