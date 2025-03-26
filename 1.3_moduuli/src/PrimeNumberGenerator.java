import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        // Luodaan Scanner-olio käyttäjän syötteen lukemista varten
        Scanner scanner = new Scanner(System.in);

        // Pyydetään käyttäjää syöttämään alku- ja loppuarvo
        System.out.print("Give prime number: ");
        int start = scanner.nextInt();

        System.out.print("give non prime number : ");
        int end = scanner.nextInt();

        // Tarkistetaan, että syötteet ovat kelvollisia
        if (start < 2 || end <= start) {
            System.out.println("wrong");
            return;
        }

        // Tulostetaan alkuluvut annetulla välillä
        System.out.println("Prime number " + start + " - " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        // Suljetaan Scanner
        scanner.close();
    }

    // Metodi tarkistaa, onko luku alkuluku
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}