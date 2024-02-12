package test.hw_3.tdd;

import HW_3.tdd.User;
import HW_3.tdd.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRepositoryTest {
    private UserRepository userRepository;
    private List<User> data;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepository();
        data = new ArrayList<>();
    }

    @Test
    public void testAddUser() {
        User user = new User("username", "password", false);
        userRepository.addUser(user);

        data = userRepository.data;
        Assertions.assertEquals(1, data.size());
        assertTrue(data.contains(user));
    }

    @Test
    public void testFindByName_True_WhenUserExists() {
        User user = new User("username", "password", false);
        userRepository.addUser(user);

        boolean result = userRepository.findByName("username");
        assertTrue(result);
    }
    @Test
    public void testFindByName_False_UserNotExists() {
        User user = new User("username", "password", false);
        userRepository.addUser(user);

        boolean result = userRepository.findByName("username2");
        assertFalse(result);
    }

    @Test
    public void testFindByName_False_WhenUserDoesNotExist() {
        boolean result = userRepository.findByName("username");
        assertFalse(result);
    }

    @Test
    void testLogoutAllExceptAdmins() {
        User admin1 = new User("admin1", "password1", true);
        User admin2 = new User("admin2", "password2", true);
        User regularUser1 = new User("user1", "password3", false);
        User regularUser2 = new User("user2", "password4", false);

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(admin1);
        userRepository.addUser(admin2);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        userRepository.logoutAllExceptAdmins();

        assertTrue(admin1.isAuthenticate());
        assertTrue(admin2.isAuthenticate());
        assertFalse(regularUser1.isAuthenticate());
        assertFalse(regularUser2.isAuthenticate());
    }

}
