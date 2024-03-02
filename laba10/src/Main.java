class Animal {
    protected String food;
    protected String location;
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Животное спит");
    }
    public void eat() {
        System.out.println("Животное ест " + food);
    }
    public void sleep() {
        System.out.println("Животное спит");
    }
}
class Dog extends Animal {
    private String poroda;
    public Dog(String food, String location, String porodaA) {
        super(food, location);
        this.poroda = porodaA;
    }
    @Override
    public void makeNoise() {
        System.out.println(poroda + " лает");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }
}
class Cat extends Animal {
    private String porodca;
    public Cat(String food, String location, String porodacA) {
        super(food, location);
        this.porodca = porodacA;
    }
    @Override
    public void makeNoise() {
        System.out.println(porodca + " мяукает");
    }
    @Override
    public void eat() {
        System.out.println("Кошка ест " + food);
    }
}
class Horse extends Animal {
    private String porodaha;
    public Horse(String food, String location, String porodahA) {
        super(food, location);
        this.porodaha = porodahA;
    }
    @Override
    public void makeNoise() {
        System.out.println(porodaha + " ржёт");
    }
    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }
}
class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Еда: " + animal.food);
        System.out.println("Местоположение: " + animal.location);
    }
}
public  class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Мясо", "Будка", "Питбуль");
        Cat cat = new Cat("Рыба", "Дом", "Мейн-кун");
        Horse horse = new Horse("Сено", "Поле", "Мустанг");

        dog.makeNoise();
        dog.eat();
        cat.makeNoise();
        cat.eat();
        horse.makeNoise();
        horse.eat();

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(cat);//вызов метода для обьекта
        veterinarian.treatAnimal(horse);
    }
}
// Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
// Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют методы makeNoise, eat.
// Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных. Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод распечатывает food и location пришедшего на прием животного.