import java.util.*;

interface Notifier { //(издатель) определение методов
    void addObserver(Observer obs); //добавить наблюдателя
    void notifyObserver(String message); //уведомить наблюдателя
}

class Group implements Notifier { //реализация издателя
    private List<Observer> observers; //список подписчиков
    private String name; //название группы

    public Group(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObserver(String message) {
        for (Observer obs : observers) {
            obs.update(name, message); //уведомить каждого подписчика о новом сообщении
        }
    }

    public void postMessage(String message) {
        System.out.println("новое сообщение в " + name + ": " + message);
        notifyObserver(message); //опубликовать сообщение и уведомить подписчиков
    }
}

interface Observer {
    void update(String groupName, String message); //обновить состояние при получении нового сообщения
}

class User implements Observer {
    private String name; //имя пользователя
    private final List<Group> subGroups; //список групп, на которые подписан пользователь

    public User(String name) {
        this.name = name;
        this.subGroups = new ArrayList<>();
    }

    public void sub(Group group) {
        subGroups.add(group);
        group.addObserver(this); //подписка на группу
    }

    public void update(String groupName, String message) {
        System.out.println(name + " получил новое сообщение из " + groupName + ": " + message);
    }
}

public class Main {
    public static void main(String[] args) {

        Group group1 = new Group("group1");
        Group group2 = new Group("group2");
        Group group3 = new Group("group3");
        Group group4 = new Group("group4");

        User user1 = new User("user1");
        User user2 = new User("user2");

        user1.sub(group1);
        user1.sub(group2);
        user1.sub(group3);
        user2.sub(group1);
        user2.sub(group2);
        user2.sub(group3);
        user2.sub(group4);

        group1.postMessage("Message1");
        group2.postMessage("Message2");
        group3.postMessage("Message3");
        group4.postMessage("Message4");
    }
}
