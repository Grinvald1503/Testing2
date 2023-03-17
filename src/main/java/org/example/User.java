package org.example;

import java.util.Objects;

public class User {
    private String login;
    private String email;
    public User() {
        this.login = "not login";
        this.email = "not email";
    }

    public User(String login, String email) {
        if (login.equals(email)) {
            throw new RuntimeException("Почта и логин не должны совпадать");
        }
        if (login == null || login.isEmpty()) {
            this.login = "not login";
        } else {
            this.login = login;
        }

        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else if (email == null || email.isEmpty()) {
            this.login = "not email";
        } else {
            throw new RuntimeException("email указан неверно");
        }


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
