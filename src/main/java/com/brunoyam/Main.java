package com.brunoyam;

import com.brunoyam.dto.User;
import com.brunoyam.service.UserService;
import com.brunoyam.service.impl.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        List<User> users = userService.getAllUsers();
        System.out.println("All users: " + users);

        User user = new User();

        user.setName("Петя', 16); UPDATE users SET age = 65 WHERE id = 2 --");
        user.setAge(16);

        userService.addUser(user);
    }
}
