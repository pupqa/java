public class Reader {
    public String fullName;
    public int nomerKarti;
    public String faculty;
    public String dateOfBirth;
    public String phoneNumber;
    public Reader(String fullName, int nomerKarti, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.nomerKarti = nomerKarti;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }
    public void takeBook(String[] books) {
        System.out.print(fullName + " взял книги:");
        for (String book : books) {//текущий элемент массива books присваивается переменной book
            System.out.print(book + ", ");
        }
        System.out.println();
    }
    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }
    public void returnBook(String[] books) {//последовательно принимает значение каждого элемента массива books
        System.out.print(fullName + " вернул книги:");
        for (String book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Петров В.В.", 1234, "Факультет 1", "10.05.1990", "123-456-789");
        readers[1] = new Reader("Иванов И.И.", 2345, "Факультет 2", "15.07.1995", "987-654-321");
        readers[2] = new Reader("Сидоров А.П.", 3456, "Факультет 3", "20.11.1988", "555-111-222");
        readers[3] = new Reader("Козлова М.С.", 4567, "Факультет 2", "05.03.1991", "777-888-999");
        readers[4] = new Reader("Смирнова О.Н.", 5678, "Факультет 1", "25.09.1993", "444-333-222");

        readers[0].takeBook(3);
        readers[0].takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия"});
        readers[1].returnBook(2);
        readers[1].takeBook(new String[]{"драма", "Энциклопедия"});
        readers[2].returnBook(4);
        readers[2].returnBook(new String[]{"Приключения", "Энциклопедия", "трагедия", " фантастика"});
        readers[2].returnBook(new String[]{"Приключения", "Энциклопедия", "трагедия", " фантастика", "gvgbuhj", "drxcytrfvygh"});
        readers[3].returnBook(1);
        readers[3].returnBook(new String[]{"Приключения"});
        readers[4].takeBook(3);
        readers[4].takeBook(new String[]{"Приключения", "комедия", "Энциклопедия"});
    }
}
