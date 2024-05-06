package homework2;
//Пользователь вводит целое положительное n, ему на консоль выводятся первые n членов последовательности Фибоначчи. Написать используя как for, так и while. Обеспечить повторный ввод пользователем (чтобы вводил и получал данные, пока ему не надоест)
//* п-ть Фибоначчи - числовая последовательность, начинающаяся с двух единиц, где каждое последующее число равно сумме двух предыдущих: 1 1 2 3 5 8 13 21 ...
import java.util.Scanner;
public class QA27_2_7_Khamtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a positive integer n: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Error: number must be positive.");
            } else {
                System.out.println("First " + n + " members of the Fibonacci sequence:");
                for (int i = 1; i <= n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                System.out.println();
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');
        if (choice == 'n') {
            System.out.print("Thank you for using Fibonacci sequence.");
        }

        scanner.close();
    }
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int a = 1, b = 1, c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }


}
