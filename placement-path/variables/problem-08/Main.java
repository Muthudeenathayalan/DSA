import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        int consent = input.nextInt();
        int override = input.nextInt();

        boolean eligible = (consent == 1) && (age >= 18 || override == 1);

        System.out.println(eligible);
    }
}