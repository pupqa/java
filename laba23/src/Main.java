interface V380 {
    void work();
}

interface V220 {
    void charge();
}

class Napr380 implements V380 {
    final public int VOLT = 380;

    public void work() {
        System.out.println("Класс напряжения " + VOLT + " вольт");
    }
}

class Napr220 implements V220 {
    final public int VOLT = 220;

    public void charge() {
        System.out.println("напряжение " + VOLT + " вольт");
    }
}

class Adapter implements V220 {
    V380 v380;
    V220 v220;

    public Adapter() {
        this.v380 = new Napr380();
        this.v220 = new Napr220();
    }

    public void charge() {
        System.out.println("заряжает телефон на 220 вольт через 380 вольт");
    }
}

public class Main {
    public static void main(String[] args) {

        V380 Napr380Device = new Napr380();
        Napr380Device.work();

        V220 Napr220Device = new Napr220();
        Napr220Device.charge();

        Adapter adapter = new Adapter();
        adapter.charge();
    }
}