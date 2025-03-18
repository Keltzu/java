// Task 3
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        // Int = tasaluku Float = Desimaali
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Float first = Float.parseFloat(scanner.nextLine());

        System.out.println("Give the second number:");
        Float second = Float.parseFloat(scanner.nextLine());

        System.out.println("Give the third number:");
        Float third = Float.parseFloat(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));

        System.out.println("The product of the numbers is " + (first * second * third));

        System.out.println("The average of the numbers is " + ((first + second + third) / 3));
    }
}