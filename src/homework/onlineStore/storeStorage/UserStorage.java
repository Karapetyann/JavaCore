package homework.onlineStore.storeStorage;

import homework.onlineStore.model.User;
import homework.onlineStore.storeUtil.StorageSerializable;

import java.io.Serializable;

public class UserStorage implements Serializable {
    private User[] users = new User[10];
    private int size;

    public void addUser(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
        StorageSerializable.serializeUserStorage(this);
    }

    public User getByEmailAndPassword(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    private void extend() {
        User[] temp = new User[size + 10];
        System.arraycopy(users, 0, temp, 0, users.length);
        users = temp;
    }


    public void printUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }

    }

    public User popUser() {
        return users[size];
    }
}
