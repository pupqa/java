import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом");
        String stroka = scanner.nextLine();
        String viragenie = "((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5])";
        Pattern proverka = Pattern.compile(viragenie);//компиляция регулярки
        Matcher matcher = proverka.matcher(stroka);//поиск совпадений
        StringBuilder allMatches = new StringBuilder();
        while(matcher.find()) {//поиск соответсвий в коде
            allMatches.append("Найденный IP-адрес: ").append(matcher.group()).append("\n");
        }

        try (FileWriter writer = new FileWriter("ipv4.txt")){
            if (allMatches.length() > 0) {
                writer.write(allMatches.toString());
                System.out.println("Данные успешно записаны в файл.");
            } else {
                writer.write("IP-адрес не найден.");
                System.out.println("IP-адрес не найден.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи данных в файл.");
            e.printStackTrace();
        }
    }
}