package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum () {
        userList.add(new ForumUser(001, "John English", 'M', LocalDate.of(1988, Month.JULY, 23), 143));
        userList.add(new ForumUser(002, "NRGeek01", 'M',  LocalDate.of(1982, Month.JANUARY, 30), 88));
        userList.add(new ForumUser(003, "Quaz07", 'F',  LocalDate.of(2005, Month.DECEMBER, 2), 25));
        userList.add(new ForumUser(004, "ocelot ]:->", 'M',  LocalDate.of(2002, Month.JUNE, 6), 121));
        userList.add(new ForumUser(005, ">Priscilla<", 'F',  LocalDate.of(1995, Month.OCTOBER, 19), 25));
        userList.add(new ForumUser(006, "SnakeSolid", 'M',  LocalDate.of(1998, Month.MARCH, 26), 0));
        userList.add(new ForumUser(007, "Deathproof92", 'M',  LocalDate.of(1992, Month.MAY, 1), 3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}