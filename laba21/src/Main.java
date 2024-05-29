import java.util.*;

abstract class Transport {
    String name;
    List<String> accessories = new ArrayList<>();//список возможностей

    public String toString() {
        return "транспорт: " + name + "\n" + accessories;
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class TruckFactory extends TransportFactory {
    public Transport createTransport() {
        return new Truck();
    }
}

class ShipFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }
}

class AirplaneFactory extends TransportFactory {
    public Transport createTransport() {
        return new Airplane();
    }
}

class Truck extends Transport {
    public Truck() {
        name = "грузовик";
        accessories.add("перевозки по дороге");
        accessories.add("безопасность");
        accessories.add("доступность");
        accessories.add("быстрота доставки");
        accessories.add("контроль груза");
    }
}

class Ship extends Transport {
    public Ship() {
        name = "судно";
        accessories.add("перевозки по воде");
        accessories.add("безопасность");
        accessories.add("доступность");
        accessories.add("быстрота доставки");
    }
}

class Airplane extends Transport {
    public Airplane() {
        name = "самолет";
        accessories.add("перевозки по воздуху");
        accessories.add("безопасность");
        accessories.add("быстрота доставки");
    }
}

public class Main {
    public static void main(String[] args) {
        TransportFactory truckFactory = new TruckFactory();//вызов фабричного метода
        TransportFactory airplaneFactory = new AirplaneFactory();
        TransportFactory shipFactory = new ShipFactory();

        Transport truck = truckFactory.createTransport();
        Transport airplane = airplaneFactory.createTransport();
        Transport ship = shipFactory.createTransport();

        System.out.println(truck);
        System.out.println(airplane);
        System.out.println(ship);
    }
}
