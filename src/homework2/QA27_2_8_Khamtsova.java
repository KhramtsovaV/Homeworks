package homework2;
/*а каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и
количество месяцев. А банк вычисляет конечную сумму вклада с учетом
начисления процентов за каждый месяц.
Способ 1: использовать for
Способ 2: использовать математику
* большим плюсом будет хранение валюты и ее
расчеты в целых числах. Можете использовать как 1, т
ак и 2 переменные, сумму можно вводить отдельно для долларов/центов (рублей/копеек),
выводить ее желательно слитно через точку.
 */

import java.util.Scanner;
public class QA27_2_8_Khamtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a deposit amount: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter a count of months: ");
        int months = scanner.nextInt();

        for (int i = 0; i < months; i++) {
            depositAmount += depositAmount * 0.07;
        }

        System.out.printf("Final deposit amount in " +months + " months: " + depositAmount);

        scanner.close();
    }
}
