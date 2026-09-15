import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        double hours = input.nextDouble();
        boolean eligible = input.nextBoolean();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hours: "+hours);
        System.out.println("Eligible: "+eligible);
    }
}
