class Person {
    private int age;
    public String fullName;
    public String phone;
    public Person(String fullNameA, String phoneA, int ageA) { //ппип
        this.fullName = fullNameA;
        this.phone = phoneA;
        this.age = ageA;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Person {
    public int course;
    public String faculty;
    private String postup;
    public Student(String fullName, String phone, int age, int courseA, String facultyA, String postupA) {
        super(fullName, phone, age);
        this.course = courseA;
        this.faculty = facultyA;
        this.postup = postupA;
    }
    public String getPostup() {
        return postup;
    }
}
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Мыфлов Никита Алексеевич", "+12345", 19, 1, "Физика", "01.09.2023");
        students[1] = new Student("Полов Андрей Андреевич", "+54321", 20, 2, "Математика", "01.09.2022");
        students[2] = new Student("Стенов Виктор Владимирович", "+23154", 21, 4, "Химия", "01.09.2020");
        System.out.println("ФИО и возраст всех студентов:");
        for (Student student : students) {
            System.out.println(student.fullName + ", возраст: " + student.getAge());
        }
        String facultet = "Математика";
        System.out.println("Студенты факультета " + facultet + ":");
        for (Student student : students) {
            if (student.faculty.equals(facultet)) {
                System.out.println(student.fullName);
            }
        }
        int poiskYear = 2020;
        System.out.println("\nСписок студентов, поступивших после " + poiskYear + " года:");
        for (Student student : students) {
            int postupYear = Integer.parseInt(student.getPostup().split("\\.")[2]);
            if (postupYear > poiskYear) {
                System.out.println(student.fullName);
            }
        }
    }
}
