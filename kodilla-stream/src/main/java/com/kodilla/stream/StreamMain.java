package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> Period.between(user.getUserDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getUserPostsQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserIdNo, user -> user));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}