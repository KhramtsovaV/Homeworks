package homework2;
//Для введенного числа t (температура на улице) вывести
//Если t>–5, то вывести «Тепло».
//Если –5>= t > –20, то вывести «Нормально».
//Если –20>= t, то вывести «Холодно».
//* Рекомендую использовать константы для чисел

import java.util.Scanner;

public class QA27_2_2_Khamtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        boolean hot = temperature > -5.0;
        boolean normal = temperature >= -5.0 && temperature <= 20.0;
        boolean cold = temperature >= -20.0;

        String weather;


        if (hot) {
            weather = "hot";
        } else if (normal) {
            weather = "normal";
        }else weather = "cold";

        System.out.println("Today weather is " + weather);

    }
}
