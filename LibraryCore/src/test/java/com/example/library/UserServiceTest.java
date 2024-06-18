package com.example.library;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class UserServiceTest {
    @Test
    public void testAddUser() {
        UserService userService = new UserService();
        User user = new User(1, "Alice");
        userService.addUser(user);
        assertEquals(user, userService.getUser(1));
    }

    @Test
    public void testGetUser() {
        UserService userService = new UserService();
        User user = new User(1, "Alice");
        userService.addUser(user);
        User retrievedUser = userService.getUser(1);
        assertNotNull(retrievedUser);
        assertEquals("Alice", retrievedUser.getName());
    }

    @Test
    public void testSearchUsersByName() {
        UserService userService = new UserService();
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");
        userService.addUser(user1);
        userService.addUser(user2);
        List<User> users = userService.searchUsersByName("Bo");
        assertEquals(1, users.size());
        assertEquals("Bob", users.get(0).getName());
    }
}
