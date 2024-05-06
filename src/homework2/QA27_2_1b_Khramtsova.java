package homework2;

import java.util.Scanner;

public class QA27_2_1b_Khramtsova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month:");
        int month = scanner.nextInt();
        String season;


        boolean winter = month >= 12 || month <= 2;
        boolean spring = month >= 3 && month <= 5;
        boolean summer = month >= 6 && month <= 8;


        if (winter) {
            season = "winter";
        } else {
            if (spring) {
                season = "spring";
            } else {
                if (summer) {
                    season = "summer";
                } else {
                    season = "autumn";
                }
            }
        }

        System.out.println("Number of month " + month + " is " + season);

        scanner.close();
    }
}

