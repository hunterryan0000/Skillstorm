package com.example.ExceptionHandling;

import java.util.Objects;

public class HashEquals {
    public static void main(String[] args) {

    }
}
class User {

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}

class Passenger extends User {

    // BUSINESS, PERSONAL, etc.
    private String accountType;

    public Passenger() {
        super();
    }

    // Do not delete this constructor.
    public Passenger(String name, String accountType) {
        super();
        this.setName(name);
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(accountType, passenger.accountType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accountType);
    }
}

