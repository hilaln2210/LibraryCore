package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUser(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<User> searchUsersByName(String name) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getName().contains(name)) {
                result.add(user);
            }
        }
        return result;
    }
}
