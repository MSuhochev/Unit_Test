package test.hw_3.tdd;

import HW_3.tdd.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("Maks", "swordfish", false);
    }

    @Test
    public void constructorTest() {
        assertEquals("Maks", user.getName());
        assertEquals("swordfish", user.getPassword());
        assertTrue(user.isAdmin());
        assertFalse(user.isAuthenticate());
    }

    @Test
    public void testAuthenticate() {
        assertTrue(user.authenticate("Maks", "swordfish"));
        assertFalse(user.authenticate("Maks", "pass"));
        assertFalse(user.authenticate("July", "swordfish"));
    }

    @Test
    public void testSetName() {
        user.setName("Victor");
        assertEquals("Victor", user.getName());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("swordfish333");
        assertEquals("swordfish333", user.getPassword());
    }

    @Test
    public void testIsAuthenticate() {
        assertFalse(user.isAuthenticate());
        user.setAuthenticate(false);
        assertFalse(user.isAuthenticate());
    }
}
