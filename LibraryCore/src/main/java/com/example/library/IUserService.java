package com.example.library;

import java.util.List;

public interface IUserService {
    void addUser(User user);
    User getUser(int id);
    List<User> searchUsersByName(String name);
}
