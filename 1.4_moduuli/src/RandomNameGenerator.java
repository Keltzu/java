import java.util.Random;
import java.util.Scanner;

public class RandomNameGenerator {
    public static void main(String[] args) {
        // taulukko etunimille
        String[] firstNames = {"Matti", "Liisa", "Pekka", "Sari", "Jussi", "Anna", "Teemu", "Elina"};

        // taulukko sukunimille
        String[] lastNames = {"Virtanen", "Korhonen", "Mäkinen", "Nieminen", "Heikkinen", "Koskinen", "Laine", "Salminen"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kuinka monta satunnaista nimeä haluat luoda? ");
        int nameCount = scanner.nextInt();

        Random random = new Random();

        // generoidaan ja tulostetaan satunnaiset nimet
        System.out.println("\nSatunnaisesti generoituja nimiä:");
        for (int i = 0; i < nameCount; i++) {
            // valitaan satunnainen etunimi ja sukunimi
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];

            // Kokonimi
            System.out.println(firstName + " " + lastName);
        }


        scanner.close();
    }
}
