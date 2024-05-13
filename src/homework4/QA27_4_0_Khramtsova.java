package homework4;

import java.util.Random;
import java.util.Scanner;

public class QA27_4_0_Khramtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arrays = new int[3][3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arrays[i][j][k] = random.nextInt(100);
                    System.out.print(arrays[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Enter number : ");
        int numToAdd = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arrays[i][j][k] += numToAdd;
                }
            }
        }
        System.out.println("New array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arrays[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
