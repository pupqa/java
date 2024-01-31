
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите переменную x: ");
        double x = input.nextDouble();
        System.out.println("Введите верхний предел: ");
        double n = input.nextDouble();
        double s = 0;
        for (double i = n; i >= 1; i--) {
            s = Math.pow(-1, i) * Math.pow(x, i) / factorial(i) + s;
        }
        System.out.println(s);
    }

    static double factorial(double m) {
        double res = 1;
        for (double i = 1; i <= m; i++) {
            res = res * i;
        }
        return res;
    }
}