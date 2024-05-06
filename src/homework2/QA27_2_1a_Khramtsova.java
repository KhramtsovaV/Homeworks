package homework2;

import java.util.Scanner;

public class QA27_2_1a_Khramtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month:");
        int month = scanner.nextInt();
String seasonString;

        switch (month) {
            case 12:
            case 1:
            case 2:
                seasonString = "Winter";
                 break;
            case 3:
            case 4:
            case 5:
                seasonString =  "Spring";
                break;
            case 6:
            case 7:
            case 8:
                seasonString = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                seasonString = "Autumn";
                break;
            default: seasonString = "Try again";
            break;
        }
        System.out.println(seasonString);
    }
}
