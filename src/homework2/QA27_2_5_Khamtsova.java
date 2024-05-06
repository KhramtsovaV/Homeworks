package homework2;
//Напишите программу, где пользователь вводит любое целое
//положительное число. А программа суммирует все числа от 1 до
//введенного пользователем числа.

import java.util.Scanner;

public class QA27_2_5_Khamtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("The number " + number + " is less than 1.");
        } else if (number >= 1) {
            int sum = 0;

            for (int i = 0; i <= number; i++) {
                sum += i;
            }
            System.out.println("The sum of all numbers from 1 to  " + number + " is: " + sum);
        }

        scanner.close();
    }
}