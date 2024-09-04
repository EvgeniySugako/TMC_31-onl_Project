package Homework_10;

import java.util.Objects;

public class User {
    private String name;
    private String roles;

    public User(String roles, String name) {
        this.name = name;
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return roles == user.roles && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roles);
    }

    @Override
    public String toString() {
        return "User{" + "Name = " + name + "; Roles = " + roles + '\'' +'}';
    }
}
