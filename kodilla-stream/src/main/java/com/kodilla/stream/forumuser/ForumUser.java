package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userIdNo;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int userPostsQty;

    public ForumUser(final int userIdNo, final String userName, final char userSex, final LocalDate userDateOfBirth, final int userPostsQty) {
        this.userIdNo = userIdNo;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.userPostsQty = userPostsQty;
    }

    public int getUserIdNo() {
        return userIdNo;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getUserPostsQty() {
        return userPostsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userIdNo=" + userIdNo +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userPostsQty=" + userPostsQty +
                '}';
    }
}