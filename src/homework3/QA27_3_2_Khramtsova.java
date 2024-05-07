package homework3;

import java.util.Random;
import java.util.Scanner;

//Создайте и заполните массив случайным числами и выведете
//максимальное, минимальное и среднее значение.
// Пусть будет возможность создавать массив произвольного размера, размер массива вводится с консоли.
// Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран
public class QA27_3_2_Khramtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size = random.nextInt(31) + 10;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        int sum = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }
        double average = (double) sum / size;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Averege: " + average);


        int[] evenArray = new int[size];
        int evenCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }

        if (evenCount > 0) {
            System.out.println("Array of even elements:");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("The first array has no even elements.");
        }

        scanner.close();
    }}
