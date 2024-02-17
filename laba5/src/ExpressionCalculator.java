import java.util.Scanner;
public class ExpressionCalculator {
    public int var1(int x) {
        return 3 * x + 5;
    }
    public double var2(double a, double b) {
        return (a + b) / (a - b);
    }
    public double var3(double a, double x, double b) {
        double result = 1;
        int factorial = (int) (a * x / b);
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();
        System.out.print("введите значение 'x' для выражении y=3x+5: ");
        int x = scanner.nextInt();
        int result1 = calculator.var1(x);
        System.out.println("y = " + result1);
        System.out.print("введите значение 'a' в выражении y=(a+b)/(a-b): ");
        double a = scanner.nextDouble();
        System.out.print("введите значение 'b' в выражении y=(a+b)/(a-b): ");
        double b = scanner.nextDouble();
        double result2 = calculator.var2(a, b);
        System.out.println("y = " + result2);
        System.out.print("введите значение 'a' в выражении y=(ax/b)!: ");
        double a3 = scanner.nextDouble();
        System.out.print("введите значение 'x' в выражении y=(ax/b)!: ");
        double x3 = scanner.nextDouble();
        System.out.print("введите значение 'b' в выражении y=(ax/b)!: ");
        double b3 = scanner.nextDouble();
        double result3 = calculator.var3(a3, x3, b3);
        System.out.println("y = " + result3);
        scanner.close();
    }
}