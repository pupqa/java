import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом");
        String stroka = scanner.nextLine();
        String viragenie = "((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5]++)";
        Pattern proverka = Pattern.compile(viragenie);
        Matcher matcher = proverka.matcher(stroka);

        while(matcher.find()) {
            String ipadres = matcher.group();
            System.out.println("Найденный IP-адрес: " + ipadres);
        }

    }
}