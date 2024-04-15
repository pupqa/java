import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пароль (не менее 8 символов): ");
        String password = input.next();
        System.out.println(reg(password));
    }
    public static boolean reg(String password) {
        return password.matches("(?=.*[A-Za-z])(?=.*[!#$%@*()+\\-=?\\[\\]{}|~])(?!.*(\\S)\\1).{8,}") && posled(password);
    }
    public static boolean posled(String password) {
        for (int i = 0; i < password.length() - 2; i++) {//проход по паролю, оставляя два символа на проверку впереди.
            if (password.charAt(i + 1) == password.charAt(i) + 1 && password.charAt(i + 2) == password.charAt(i) + 2) {//проверка на то образуют лт текущий и следующие два символа последовательность
                return false;
            }
        }
        return true;
    }

}
