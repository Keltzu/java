import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        // Luodaan Scanner- ja Random-oliot käyttäjän syötteen ja satunnaislukujen käsittelyä varten
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) { // Jatketaan niin kauan, kunnes käyttäjä saa täydet pisteet
            int score = 0; // Pisteiden laskemiseen

            // Luodaan 10 satunnaista kertolaskutehtävää
            for (int i = 0; i < 10; i++) {
                int factor1 = random.nextInt(10) + 1; // Satunnainen luku välillä 1-10
                int factor2 = random.nextInt(10) + 1; // Satunnainen luku välillä 1-10
                int correctAnswer = factor1 * factor2; // Oikea vastaus

                // Kysytään käyttäjältä vastaus
                System.out.print("What is " + factor1 + " x " + factor2 + "? ");
                int userAnswer = scanner.nextInt();

                // Tarkistetaan, onko vastaus oikein
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++; // Lisätään piste
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer);
                }
            }

            // Tarkistetaan, saiko käyttäjä täydet pisteet
            if (score == 10) {
                System.out.println("Congratulations! You have mastered the multiplication tables.");
                break; // Lopetetaan ohjelma, jos kaikki vastaukset olivat oikein
            } else {
                System.out.println("You scored " + score + "/10. Try again!");
            }
        }

        // Suljetaan Scanner
        scanner.close();
    }
}
