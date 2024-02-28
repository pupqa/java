import java.util.Scanner;

public class Product {
    public String name;
    public String manufacturer;
    public double price;
    public int expirationDate;
    public int quantity;

    public Product(String name, String manufacturer, double price, int expirationDate, int quantity) {
        this.name = name;//наименование
        this.manufacturer = manufacturer;//Проихводитель
        this.price = price;//цена
        this.expirationDate = expirationDate;//срокХран
        this.quantity = quantity;//кол-во
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание массива объектов типа Product
        Product[] products = new Product[3];
        products[0] = new Product("Молоко", "Молочный комбинат", 2.5, 30, 10);
        products[1] = new Product("Хлеб", "Хлебзавод", 1.2, 7, 5);
        products[2] = new Product("Мясо", "Мясокомбинат", 6.8, 14, 3);

        // Запрашиваем у пользователя наименование товара
        System.out.println("Введите наименование товара: ");
        String name = scanner.nextLine();

        System.out.println("Список товаров для наименования \"" + name + "\":");
        for (Product product : products) {
            if (product.name.equals(name)) {
                System.out.println(product.name + " - " + product.manufacturer + " - Цена: " +
                        product.price + " - Срок хранения: " + product.expirationDate +
                        " - Количество: " + product.quantity);
            }
        }
    }
}
