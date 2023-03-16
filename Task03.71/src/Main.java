import java.util.Scanner;

public class Main {

    private static void showConst (){
        System.out.println("(-2.0, 2.0) -> " + picture.getColor(-2, 2));
        System.out.println("(-2.0, -2.0) -> " + picture.getColor(-2, -2));
        System.out.println("(2.0, -3.0) -> " + picture.getColor(2, -3));
        System.out.println("(3.0, 2.0) -> " + picture.getColor(-4, 5));
    }

    public static void main(String[] args) {
        showConst();
        if (test.tests()) {

            System.out.print("Введите x: ");
            double x = readNum();

            System.out.print("Введите y: ");
            double y = readNum();

            printColorForPoint(x, y);
        }
        else {
            System.out.println("Ошибка, введите новые данные");
        }
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s%n", x, y, picture.getColor(x, y));
    }

    private static double readNum() {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        if (Math.abs(value) > 10) {
            System.out.println("Ошибка, координаты не найдены ");
            System.exit(1);
        }
        return value;
    }

    private static final Picture picture = new Picture(new Parabola(6, -5, 0.125),
            new Rectangle(2, 4, -4, 1),
            new Rectangle(4, 7, -5, 0));

    private static final Tests test = new Tests();
}