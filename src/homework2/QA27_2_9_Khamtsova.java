package homework2;
//Вывести на консоль таблицу умножения.
// Использовать System.out.print(...) , куда выводить в том числе пробелы между числами
public class QA27_2_9_Khamtsova {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                int result = i * j;
                System.out.print(result + " ");


                if (result < 10) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
