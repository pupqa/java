class Person {
    public String firstName;
    private String lastName;
    private int birthYear;
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public void printInfo() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Год рождения: " + birthYear);
    }
}
class Car {
    public String brand;
    private int year;
    private double engineVolume;
    public Car(String brand, int year, double engineVolume) {
        this.brand = brand;
        this.year = year;
        this.engineVolume = engineVolume;
    }
    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объем двигателя: " + engineVolume);
    }
}
class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void printInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
    }
    public void read(Person person, Car car) {
        System.out.println(person.firstName + " читает книгу " + title + " про машину " + car.brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов", 1990);
        person.printInfo();
        System.out.println();
        Car car = new Car("Toyota", 2021, 2.0);
        car.printInfo();
        System.out.println();
        Book book = new Book("Журнал", "Top Gear", 2022);
        book.printInfo();
        System.out.println();
        book.read(person, car);
    }
}
