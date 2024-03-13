interface Product {
    void setName(String name);
    void setPrice(double price);
    void setRating(int rating);
    String getName();
    double getPrice();
    int getRating();
}
class Product1 implements Product {
     String name;
     double price;
     int rating;
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}
class Product2 implements Product {
     String name;
     double price;
     int rating;
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}
class Product3 implements Product {
     String name;
     double price;
     int rating;
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
}
interface User {
    void setLogin(String login);
    void setPassword(String password);
    String getLogin();
    String getPassword();
}
class User1 implements User {
     String login;
     String password;
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
class User2 implements User {
     String login;
     String password;
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
class User3 implements User {
     String login;
     String password;
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}
class ProductUser implements Product, User {
     String name;
     double price;
     int rating;
     String login;
     String password;
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRating() {
        return rating;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public void purchaseProduct() {
        System.out.println("Пользователь " + login + " купил " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        User sss = new User1();
        Product product1 = new Product1();
        Product product2 = new Product2();
        User user1 = new User1();
        User user2 = new User2();
        ProductUser productUser = new ProductUser();
        productUser.setName("хлеб");
        productUser.setLogin("Хихунчик");
        productUser.purchaseProduct();
    }
}