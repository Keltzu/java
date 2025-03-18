import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter farenheit: ");
        double f = Double.parseDouble(sc.nextLine());
        double c = ((f-32)*5)/9;

        System.out.println("farenheit to celsius is " + String.format("%.1f", c));
    }
}
