package homework3;
import java.util.Scanner;
import java.util.Random;


public class QA27_3_4_Khramtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size;
        do {
            System.out.print("Enter array size (from 6 to 10): ");
            size = scanner.nextInt();
        } while (size < 6 || size > 10);


        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("First array is: :");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] evenArray = new int[size];
        int evenCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }


        if (evenCount > 0) {
            System.out.println("Second array of even elements:");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("The first array has no even elements.");
        }

        scanner.close();
    }
}
