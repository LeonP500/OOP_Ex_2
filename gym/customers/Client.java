package gym.customers;

import gym.management.Observer;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person  implements Observer {

    private List<String> notifications;

    public Client(String name, int balance, Gender gender, String birthdate) {
        super(name, balance, gender, birthdate);
        this.notifications = new ArrayList<>();

    }

    public void update(String message) {
        notifications.add(message);
    }

    public List<String> getNotifications() {
        return notifications;
    }
@Override
    public String toString() {
    return "ID: " + getId() +
            " | Name: " + getName() +
            " | Gender: " + getGender() +
            " | Birthday: " + getBirthdate() +
            " | Age: " + getAge() +
            " | Balance: " + getBalance();
}

}
