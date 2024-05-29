class calcul {
    static calcul instance = null;

    calcul() {}

    static calcul getInstance() {
        if (instance == null) {
            instance = new calcul();
        }
        return instance;
    }

    double calculate() {
        double x = 5;
        double y = 2;
        double result = 2 * x + 3 / y;
        System.out.println("Значение x: " + x);
        System.out.println("Значение y: " + y);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        calcul calc = calcul.getInstance();
        double result = calc.calculate();
        System.out.println("Результат выражения 2 * x + 3 / y = " + result);

        calcul calc2 = calcul.getInstance();
        int currentHash = System.identityHashCode(calc);
        int currentHash2 = System.identityHashCode(calc2);

        if (currentHash == currentHash2) {
            System.out.println("Создан только один экземпляр класса Calculator");
        } else {
            System.out.println("Ошибка: создано несколько экземпляров класса Calculator");
        }
    }
}
