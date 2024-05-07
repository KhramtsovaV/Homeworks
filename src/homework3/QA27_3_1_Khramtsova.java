package homework3;
//Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
//Пусть число задается с консоли (класс Scanner). Если такого числа нет -выведите сообщения об этом.
//В результате должен быть новый массив без указанного числа.

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class QA27_3_1_Khramtsova {
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

        System.out.print("Enter number to delete: ");
        int needToDelete = scanner.nextInt();

        //int[] newArray = removeElementFromArray(array, needToDelete);

        //System.out.println("Array after deletion:");
       // for (int num : newArray) {
        //    System.out.print(num + " ");
        }

       // scanner.close();
    }

