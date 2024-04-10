import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String input = scanner.nextLine();
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex);//компиляция регулярки в шаблон
        Matcher matcher = pattern.matcher(input);//объект matcher для поиска совпадений с регуляркой в строке input
        if (matcher.find())//поиск совпадений
        {
            input = input.replaceAll("\\b" + matcher.group() + "\\b", "<strong>" + matcher.group() + "</strong>");
        }
        System.out.println(input);
    }
}
