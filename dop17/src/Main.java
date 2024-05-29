import java.io.*;
import java.util.Scanner;

class laba17 implements Serializable { //не определяет никаких методов, указатель системе к сериализации
    double x;
    double y;

    public laba17(double x) { //конструктор
        this.x = x; //инициализация
        this.y = VirY(x);
    }

    double VirY(double x) { //вычисление y=x-sin(x)
        return x - Math.sin(x);
    }

    public double getY() { //получение у
        return y;
    }

    public void saveSost(String filename) { //сохранение состояния объекта в файл
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
            output.writeObject(this); //сереализация объекта
            System.out.println("Состояние объекта успешно сохранено в файл ");
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при сохранении состояния объекта: " + e.getMessage());
        }
    }

    public static laba17 vostSost(String file) { //восстановление состояния обьекта из файла
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("a.txt"))) {
            laba17 obj = (laba17) input.readObject(); //десериализация объекта из файла чтение боьекта из потока
            System.out.println("Состояние объекта успешно восстановлено из файла ");
            return obj;
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Ошибка при восстановлении состояния объекта: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            laba17 calculator = null; //объявление переменной для хранения объекта laba17

            while (true) {
                System.out.println("""
            \nВыберите действие:
            1. Вычислить значение выражения
            2. Сохранить состояние объекта
            3. Восстановить состояние объекта
            4. Выйти""");

                int choice = scanner.nextInt(); //считывание выбора пользователя
                switch (choice) {

                    case 1:
                        System.out.println("значение x: ");
                        double x = scanner.nextDouble(); //считывание значения x
                        calculator = new laba17(x); //создание объекта laba17 с введенным значением x
                        System.out.println("результат: " + calculator.getY()); //вывод значения y
                        break;

                    case 2:
                        if (calculator != null) {
                            calculator.saveSost("a.txt"); //сохранение состояния объекта в файл
                        } else {
                            System.out.println("сначала вычислите значение выражения.");
                        }
                        break;

                    case 3:
                        calculator = laba17.vostSost("a.txt"); //восстановление состояния объекта из файла
                        if (calculator != null) {
                            System.out.println(calculator.getY());
                        }
                        break;

                    case 4:
                        System.out.println("Программа завершена.");
                        return;

                    default:
                        System.out.println("Неверный ввод. Пожалуйста, выберите действие от 1 до 4.");
                }
            }
        }
    }
}
