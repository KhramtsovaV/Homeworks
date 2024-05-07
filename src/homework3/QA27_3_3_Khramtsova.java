package homework3;

import java.util.Random;
import java.util.Scanner;

public class QA27_3_3_Khramtsova {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int size = random.nextInt(31) + 10;

    int[] firstArray = new int[size];

        for (int i = 0; i < size; i++) {
        firstArray[i] = random.nextInt(100);
    }
        System.out.println("First array is:");
        for (int firstNum : firstArray) {
        System.out.print(firstNum + " ");
    }
        System.out.println();
        int firstSum = 0;
        for (int firstNum : firstArray) {
            firstSum += firstNum;
        }

        double firstAverage = (double) firstSum / firstArray.length;

        System.out.println("First array average: " + firstAverage);

        int[] secondArray = new int[size];

        for (int i = 0; i < size; i++) {
            secondArray[i] = random.nextInt(100);
        }
        System.out.println("Second array is:");
        for (int secondNum : secondArray) {
            System.out.print(secondNum + " ");
        }
        System.out.println();
        int secondSum = 0;
        for (int secondNum : secondArray) {
            secondSum += secondNum;
        }

        double secondAverage = (double) secondSum / secondArray.length;

        System.out.println("Second array average: " + secondAverage);
        System.out.println();

        if (firstAverage > secondAverage) {
            System.out.println("Average of first array is more than second");
        }
        else if (firstAverage == secondAverage) {
            System.out.println("The average value of the arrays is the same" );}
            else {
                System.out.println("Average of first array is less than second");
            }

        }

    }
