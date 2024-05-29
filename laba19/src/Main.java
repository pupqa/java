interface WomenClothing {
    void dressWoman();
}
interface MenClothing {
    void dressMan();
}
class Odevanie {
    public void dressWomen(Cloth[] clothes) {
        System.out.println("Женская одежда:");
        for (Cloth clothing : clothes) {
            if (clothing instanceof WomenClothing) {
                ((WomenClothing) clothing).dressWoman();
            }
        }
    }
    public void dressMen(Cloth[] clothes) {
        System.out.println("Мужская одежда:");
        for (Cloth clothing : clothes) {
            if (clothing instanceof MenClothing) {
                ((MenClothing) clothing).dressMan();
            }
        }
    }
}
enum Size {//возможные параметры одежды
    XXS(32), XS(34), S(36), M(38), L(40);
    int euroSize;
    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public void getEuroSize() {
        System.out.println(euroSize);
    }
    public void getDescription() {
        if (this == XXS) {
            System.out.println("Это детский размер");
        } else {
            System.out.println("Взрослый размер");
        }
    }
}
abstract class Cloth {//общие свойства
    Size size;
    double cost;
    String color;
    Cloth(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
class TShirt extends Cloth implements MenClothing, WomenClothing {
    TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }
    public void dressMan() {
        System.out.println("Мужская футболка: размер - " + size + ", цена - ₽" + cost + ", цвет - " + color);
    }
    public void dressWoman() {
        System.out.println("Женская футболка: размер - " + size + ", цена - ₽" + cost + ", цвет - " + color);
    }
}
class Pants extends Cloth implements MenClothing, WomenClothing {
    Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }
    public void dressMan() {
        System.out.println("Мужские штаны: размер - " + size + ", цена - ₽" + cost + ", цвет - " + color);
    }
    public void dressWoman() {
        System.out.println("Женские штаны: размер - " + size + ", цена - ₽" + cost + ", цвет - " + color);
    }
}
class Skirt extends Cloth implements WomenClothing {
    Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }
    public void dressWoman() {
        System.out.println("Женская юбка: размер - " + size + ", цена - ₽" + cost + ", цвет - " + color);
    }
}
class Tie extends Cloth implements MenClothing {
    Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }
    public void dressMan() {
        System.out.println("Мужской галстук: размер - " + size + ", цена - ₽" + cost + ", цвет - " + color);
    }
}
public class Main {
    public static void main(String[] args) {
        Size s=Size.XXS;
        TShirt tShirt = new TShirt(Size.XS, 500, "черный");
        Pants pants = new Pants(Size.L, 1200, "серый");
        Skirt skirt = new Skirt(Size.S, 800, "фиолетовый");
        Tie tie = new Tie(Size.XXS, 200, "оранжевый");
        Cloth[] clothes = {tShirt, pants, skirt, tie};//массив одежды
        Odevanie odevanie = new Odevanie();
        odevanie.dressWomen(clothes);//метод женщин одевает
        System.out.println();
        odevanie.dressMen(clothes);
        Size.XXS.getDescription();
        Size.L.getEuroSize();
    }
}