package homework1;

public class QA27_1_3_2_2_False_Khramtsova {
    public static void main(String[] args) {
        double a = 12.7;
        double c = 399.5;
        double x = c - a - 10;
        final double MAX_X;
        MAX_X = 75;
        boolean isXLessOrEqualThanMaxX = x <= MAX_X;
        System.out.println("Значение a= " + a);
        System.out.println("Значение c= " + c);
        System.out.println("Значение x= " + x);
        System.out.println("х меньше или равен MAX_X: " + isXLessOrEqualThanMaxX);
    }
}
