package homework3;
//Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).
// Размер - случайный, от 10 до 40. Диапазон чисел на ваш вкус, но меньше 10 различных элементов.
// (как и для всех последующих задач со случайным массивом)

import java.util.Random;
import java.util.Scanner;

public class QA27_3_0_Khramtsova {
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

        System.out.print("Enter number to find: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + target + " included in the array.");
        } else {
            System.out.println("Number " + target + " not included in the array.");
        }

        scanner.close();
    }
}
