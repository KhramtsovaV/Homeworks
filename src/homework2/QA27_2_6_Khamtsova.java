package homework2;
//Пользователь вводит первое число, вводит шаг, вводит max/min значение. Необходимо, чтоб программа выводила на экран последовательность
//Пример: первое число 2, шаг 4, критическое значение 11
//Вывод: 2 6 10
//Пример 2: первое число 1, шаг -5, критическое значение -17
//Вывод: 1 -4 -9 -14
//* Желательно использовать проверки на корректность введенных данных, чтобы цикл не вышел бесконечным
import java.util.Scanner;

public class QA27_2_6_Khamtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter step: ");
        int step = scanner.nextInt();

        System.out.print("Enter critical value: ");
        int criticalValue = scanner.nextInt();

        // Проверка на корректность введенных данных
        if ((step > 0 && criticalValue < firstNumber) || (step < 0 && criticalValue > firstNumber)) {
            System.out.println("Error: Critical value is not in sequence.");
        } else {
            int currentNumber = firstNumber;
            while ((step > 0 && currentNumber <= criticalValue) || (step < 0 && currentNumber >= criticalValue)) {
                System.out.print(currentNumber + " ");
                currentNumber += step;
            }
        }

        scanner.close();
    }
    }
