package com.logiqube.appserver.controller;

import com.logiqube.appserver.api.UsersApi;
import com.logiqube.appserver.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController implements UsersApi {

    @Override
    public ResponseEntity<User> createUser(User user) {
        return UsersApi.super.createUser(user);
    }

    @Override
    public ResponseEntity<Void> deleteUser(Integer userId) {
        return UsersApi.super.deleteUser(userId);
    }

    @Override
    public ResponseEntity<User> getUser(Integer userId) {
        return ResponseEntity.ok(createUser(userId));
    }

    @Override
    public ResponseEntity<List<User>> listUsers() {
        return ResponseEntity.ok(List.of(createUser(1), createUser(2)));
    }

    @Override
    public ResponseEntity<User> updateUser(Integer userId, User user) {
        return UsersApi.super.updateUser(userId, user);
    }

    private User createUser(Integer userId) {
        return new User().id(Long.valueOf(userId)).email("email"+userId+"@gmail.com").firstName("Name" + userId).lastName("Surname" + userId).username("Username"+userId);
    }
}
