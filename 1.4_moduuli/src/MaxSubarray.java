import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taulukon koko
        System.out.print("Anna taulukon koko: ");
        int size = scanner.nextInt();

        // pyydetään käyttäjää syöttämään luvut
        int[] array = new int[size];
        System.out.println("Syötä kokonaisluvut taulukkoon:");
        for (int i = 0; i < size; i++) {
            System.out.print("Syötä luku " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;


        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += array[j];

                if (sum > maxSum) {
                    maxSum = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }


        System.out.println("\nMaksimi summa: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));

        scanner.close();
    }
}
