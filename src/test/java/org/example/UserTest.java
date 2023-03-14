package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UserTest {
    private final String login = "login";
    private final String email = "test@mail.ru";
    private static final String DEFAULT_VALUE_LOGIN = "not login";
    private static final String DEFAULT_VALUE_EMAIL = "not email";
    @Test
    public void shouldCreationObjectWithPassingParameters () {
        User user = new User(login, email);
        Assertions.assertEquals(login, user.getLogin());
        Assertions.assertEquals(email, user.getEmail());
    }
    @Test
    public void shouldCreationObjectWithNotParameters () {
        User user = new User();
        Assertions.assertEquals(DEFAULT_VALUE_LOGIN, user.getLogin());
        Assertions.assertEquals(DEFAULT_VALUE_EMAIL, user.getEmail());
    }
    @Test
    public void shouldCorrectValue () {
        User user = new User(login, email);
        Assertions.assertTrue(user.getEmail().contains("@") || user.getEmail().contains("."));
    }
    @Test
    public void shouldEqualsParameters () {
        User user = new User(login, email);
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());
    }



}