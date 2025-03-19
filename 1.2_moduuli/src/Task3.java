// Task 3
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double luoti = 13.28;
        final int naula = 32;
        final int leiviska = 20;

        System.out.println("give weight in grams: ");
        double g = Double.parseDouble(sc.nextLine());

        double lu = g / luoti;
        int na = (int) (lu / naula) % leiviska;
        int le =  (int) (lu / (naula * leiviska));
        double luti = lu % naula;

        System.out.printf("paino: %d leiviska, %d naula, %.2f luoti%n", le, na, luti);




    }
}
