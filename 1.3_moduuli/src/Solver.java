import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give coefficient a: ");
        int a = sc.nextInt();
        System.out.println("Give coefficient b: ");
        int b = sc.nextInt();
        System.out.println("Give coefficient c: ");
        int c = sc.nextInt();
        System.out.println("Calculating quadratic equation");


        int D = b*b - 4*a*c;

        if (D < 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Equation has two distinct real roots: %.1f, %.1f ", x1, x2);

        } else if (D == 0) {
            double x = (double) -b / (2 * a);
            System.out.printf("Equation has on real root: %.1f ", x);
        } else {
            System.out.println("no real roots");
        }
    }
}
