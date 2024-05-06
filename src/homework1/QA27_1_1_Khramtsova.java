package homework1;
import java.util.Scanner;

public class QA27_1_1_Khramtsova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какой ваш любимый цвет?: ");
        if (scanner.hasNextLine()) {
            String color = scanner.nextLine();
            System.out.println(color + " прекрасный цвет!");


        }
    }

}