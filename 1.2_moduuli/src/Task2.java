// Task 2
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give value of first leg cm: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Give value of second leg cm: ");
        double b = Double.parseDouble(sc.nextLine());

        double c = Math.pow(a, 2) + Math.pow(b, 2);

        System.out.printf("Hypotenuse is: %6.1f", Math.sqrt(c));
    }
}
