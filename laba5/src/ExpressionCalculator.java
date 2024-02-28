import java.util.Scanner;
public class ExpressionCalculator {
    public int var1(int x) {
        return 3 * x + 5;
    }
    public double var2(double a, double b) {
        if (a - b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        } else {
            return (a + b) / (a - b);
        }
    }
    public double var3(int a, int x, int b) {
        double result = 1;
        if (b != 0) {
            int factorial = a * x / b;
            for (int i = 1; i <= factorial; i++) {
                result *= i;
            }
        } else {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return result;
    }
}
class Main {
    public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение 'x' для выражения y = 3x + 5: ");
        int x = scanner.nextInt();
        int result1 = calculator.var1(x);
        System.out.println("y = " + result1);

        System.out.print("Введите значение 'a' в выражении y = (a + b) / (a - b): ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение 'b' в выражении y = (a + b) / (a - b): ");
        double b = scanner.nextDouble();
        double result2 = calculator.var2(a, b);
        System.out.println("y = " + result2);

        System.out.print("Введите значение 'a' в выражении y = (ax / b)!: ");
        int a3 = scanner.nextInt();
        System.out.print("Введите значение 'x' в выражении y = (ax / b)!: ");
        int x3 = scanner.nextInt();
        System.out.print("Введите значение 'b' в выражении y = (ax / b)!: ");
        int b3 = scanner.nextInt();
        double result3 = calculator.var3(a3, x3, b3);
        System.out.println("y = " + result3);
    }
}

