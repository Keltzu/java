import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        // Luodaan Scanner-olio käyttäjän syötteen lukemista varten
        Scanner scanner = new Scanner(System.in);

        // Pyydetään käyttäjää syöttämään binaariluku
        System.out.print("Give binary number: ");
        String binaryString = scanner.nextLine();

        // Muuttuja desimaaliluvulle
        int decimal = 0;

        // Käydään binaarimerkkijono läpi merkki kerrallaan
        for (int i = 0; i < binaryString.length(); i++) {
            // Haetaan nykyinen merkki
            char bit = binaryString.charAt(i);

            // Tarkistetaan, että merkki on joko '0' tai '1'
            if (bit != '0' && bit != '1') {
                System.out.println("wrong number!");
                return;
            }

            // Muunnetaan merkki numeroksi ja lisätään se desimaalilukuun
            decimal = decimal * 2 + (bit - '0');
        }

        // Tulostetaan muunnettu desimaaliluku
        System.out.println("Decimal: " + decimal);

        // Suljetaan Scanner
        scanner.close();
    }
}