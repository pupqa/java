public class Student {
    private String name;
    private String dataP;
    private String adres;
    private String Ntelefona;
    private int kurs;
    private String facultet;
    public Student(String nameA, String dataPA, String adresA, String NtelefonaA, int kursA, String facultetA) {
        this.name = nameA;
        this.dataP = dataPA;
        this.adres = adresA;
        this.Ntelefona = NtelefonaA;
        this.kurs = kursA;
        this.facultet = facultetA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDataP() {
        this.dataP = dataP;
    }
    public String getDataP() {
        return dataP;
    }
    public String getAdres() {
        return adres;
    }
    public String getNtelefona() {
        return Ntelefona;
    }
    public void setNtelefona(String ntelefona) {
        this.Ntelefona = ntelefona;
    }
    public void setKurs(int kurs) {
        this.kurs = kurs;
    }
    public String getFacultet() {
        return facultet;
    }
    //ФИО(чтение и запись), дата поступления(запись), Адрес(чтение), Телефон(чтение и запись), Курс(запись), Факультет(чтение)

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Иванов Иван Иванович", "01.09.2020", "г.Пенза, ул.Ленина 1", "78093216743", 4, "Фармацевтический");
        students[1] = new Student("Петров Петр Петрович", "01.09.2019", "г.Пенза, ул.Гагарина 2", "79049873209", 5, "Фармацевтический");
        students[2] = new Student("Александров Александр Александрович", "01.09.2021", "г.Пенза, ул.Пушкина 3", "79735673278", 3, "Стоматологический");
        System.out.println("ФИО всех студентов:");
        for (Student student : students) { //проходит по всем объектам Student в массиве students
            System.out.println(student.getName());
        }
        String poiskFakultet = "Фармацевтический"; //Факультет для поиска
        System.out.println("\nСписок студентов факультета " + poiskFakultet + ":"); //Вывод студентов заданного факультета
        for (Student student : students) {
            if (student.getFacultet().equals(poiskFakultet)) {
                System.out.println(student.getName());
            }
        }
        int poiskYear = 2020;
        System.out.println("\nСписок студентов, поступивших после " + poiskYear + " года:");//Вывод списка студентов, поступивших после заданного года
        for (Student student : students) {// Цикл, который проходит по всем объектам Student в массиве students
            int postupYear = Integer.parseInt(student.getDataP().split("\\.")[2]);
            if (postupYear > poiskYear) {
                System.out.println(student.getName());// Вывод ФИО студента, если год поступления больше заданного года (poiskYear)
            }
        }
    }
}