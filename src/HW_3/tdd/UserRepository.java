package HW_3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> data = new ArrayList<>();
    public void addUser(User user) {
        if (user != null && !findByName(user.getName())) {
            data.add(user);
        }
    }
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Функция logout всех пользователей, кроме администраторов
    public void logoutAllExceptAdmins() {
        for (User user : data) {
            if (!user.isAdmin()) {
                user.setAuthenticate(false);
            }
        }
    }
}
