package com.example.library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IUserService userService = new UserService();

        // Add users
        userService.addUser(new User(1, "Alice"));
        userService.addUser(new User(2, "Bob"));

        // Get a user
        User user = userService.getUser(1);
        System.out.println("Got user: " + user.getName());

        // Search users by name
        List<User> users = userService.searchUsersByName("Bo");
        System.out.println("Found users: " + users.size());
    }
}
