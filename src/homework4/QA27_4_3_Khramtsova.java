package homework4;

import java.util.Random;

public class QA27_4_3_Khramtsova {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    }


