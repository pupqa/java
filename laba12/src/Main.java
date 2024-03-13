public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов Иван Иванович", 35, "viva", "Профессор", "GR-OPJGR-GRO");
        Teacher teacher2 = new Teacher("Мувов Иван Иванович", 60, "biba", "Преподаватель", "OPUA-VNAO-AIEH");
        Student student1 = new Student("Зебров Иван Иванович", 20, "mima", "Студент 1курс", "PA-VKSLQ-OSK");
        Student student2 = new Student("Козин Иван Иванович", 21, "pipa", "Студент 2курс", "IY-HNT-WNTAA-JSRT");
        teacher1.login();
        teacher1.password();
        teacher2.login();
        teacher2.password();
        student1.login();
        student1.password();
        student2.login();
        student2.password();
    }
}
interface User {
    void login();
    void password();
}
abstract class People implements User {
    String fullName;
    int age;
    String login;
    String position;
    String password;
    public People(String fullName, int age, String login, String position, String password) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.login = login;
        this.password = password;
    }
}
class Teacher extends People {
    public Teacher(String fullName, int age, String login, String position, String password) {
        super(fullName, age, login, position, password);
    }
    @Override
    public void login() {
        System.out.println("Логин: " + fullName + ": " + login);
    }
    @Override
    public void password() {
        System.out.println("Пароль: " + fullName + ": " + password);
    }
}
class Student extends People {
    public Student(String fullName, int age, String login, String position, String password) {
        super(fullName, age, login, position, password);
    }
    @Override
    public void login() {
        System.out.println("Логин: " + fullName + ": " + login);
    }
    @Override
    public void password() {
        System.out.println("Пароль: " + fullName + ": " + password);
    }
}
