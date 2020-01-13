package com.kodilla.good.patterns.challenges;

public class User {
    private final String nickname;
    private final String firstName;
    private final String lastName;

    public User(final String nickname, final String firstName, final String lastName) {
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}