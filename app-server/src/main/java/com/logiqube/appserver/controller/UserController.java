package com.logiqube.appserver.controller;

import com.logiqube.appserver.api.UsersApi;
import com.logiqube.appserver.api.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

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
        return UsersApi.super.getUser(userId);
    }

    @Override
    public ResponseEntity<List<User>> listUsers() {
        return UsersApi.super.listUsers();
    }

    @Override
    public ResponseEntity<User> updateUser(Integer userId, User user) {
        return UsersApi.super.updateUser(userId, user);
    }
}
