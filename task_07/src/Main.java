import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сумма равна: " + test1());
        System.out.println("Сумма равна: " + test2());
        System.out.println("Сумма равна: " + test3());
        System.out.println("Сумма равна: " + test4());
        System.out.println("Сумма равна: " + test5());
        System.out.println("Сумма равна: " + inputValue());
    }

    public static long Solution(long[] arr) {
        long sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (isFactorial(arr[j])) {
                sum += arr[j];
            }
        }
        return sum;
    }

    public static long inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        String line = sc.nextLine();
        String[] lineArray = line.split(" ");
        long[] numbers = new long[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            numbers[i] = Integer.parseInt(lineArray[i]);
        }
        return Solution(numbers);
    }

    static boolean isFactorial(long n) {
        for (int i = 1; ; i++) {
            if (n % i == 0) {
                n /= i;
            } else {
                break;
            }
        }
        return n == 1;
    }

    public static long test1() {
        long[] a = new long[]{2, 6, 24, 120};
        System.out.println(Arrays.toString(a));
        return Solution(a);
    }

    public static long test2() {
        long[] a = new long[]{1, 1, 6, 6};
        System.out.println(Arrays.toString(a));
        return Solution(a);
    }

    public static long test3() {
        long[] a = new long[]{25, 121, 7, 10};
        System.out.println(Arrays.toString(a));
        return Solution(a);
    }

    public static long test4() {
        long[] a = new long[]{1, 1, 1, 1};
        System.out.println(Arrays.toString(a));
        return Solution(a);
    }

    public static long test5() {
        long[] a = new long[]{0, 0, 0, 0};
        System.out.println(Arrays.toString(a));
        return 0;
    }

}