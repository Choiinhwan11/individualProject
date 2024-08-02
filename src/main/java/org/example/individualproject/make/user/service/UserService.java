package org.example.individualproject.make.user.service;

import org.example.individualproject.make.user.entity.User;

public interface UserService {
    boolean join(User user);

    String login(String userId, String password);
}
