// Task 3
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        // Int = tasaluku Float = Desimaali
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double first = Double.parseDouble(scanner.nextLine());

        System.out.println("Give the second number:");
        double second = Double.parseDouble(scanner.nextLine());

        System.out.println("Give the third number:");
        double third = Double.parseDouble(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));

        System.out.println("The product of the numbers is " + (first * second * third));

        System.out.println("The average of the numbers is " + ((first + second + third) / 3));
    }
}