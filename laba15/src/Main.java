import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

        try {
            File file = new File("C:\\ип адрес\\ipv4.txt");
            FileWriter writer = new FileWriter(file);

            while (matcher.find()) {
                String ipadres = matcher.group();
                System.out.println("Найденный IP-адрес: " + ipadres);
                writer.write("" + ipadres + "\n");
            }

            writer.close();
            System.out.println("Результаты записаны в файл ipv4.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}