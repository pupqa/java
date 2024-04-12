import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputF = "input.txt";
        String outputF = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputF));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputF))) {
            String a;
            StringBuilder sb = new StringBuilder(); //буфер для сбора результата

            while ((a = reader.readLine()) != null) { //чтение строки из файла
                sb.append(a).append("\n"); //добавление строки в буфер
            }

            String result = sb.toString().replaceAll("(?s)/\\*.*?\\*/", "");
            result = result.replaceAll("//.*", "");
            writer.write(result);

            System.out.println("Текст без комментариев записан в файл ");
        }
        catch (IOException e) {
            System.out.println("Ошибка при чтении или записи файлов.");
            e.printStackTrace();
        }
    }
}
