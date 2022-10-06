package com.art.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void getAll() {
       assertEquals(3, userService.getAll().size());
    }
}