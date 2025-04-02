import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna taulukon koko: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Syötä kokonaisluvut taulukkoon:");
        for (int i = 0; i < size; i++) {
            System.out.print("Syötä luku " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] uniqueArray = new int[size];
        int uniqueCount = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }


        System.out.println("\nTaulukko ilman duplikaatteja:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }

        scanner.close();
    }
}
