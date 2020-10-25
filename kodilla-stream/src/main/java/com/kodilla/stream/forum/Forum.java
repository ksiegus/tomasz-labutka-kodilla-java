package com.kodilla.stream.forum;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Andrzej Andrzejewski", 'M', LocalDate.of(2001,1,8), 1));
        theUserList.add(new ForumUser(2, "Martyna Maciejewska", 'F', LocalDate.of(1978,4,5), 2));
        theUserList.add(new ForumUser(3, "Adam Adamowski", 'M', LocalDate.of(2001,12,19), 5));
        theUserList.add(new ForumUser(4, "Zenon Zenkiewicz", 'M', LocalDate.of(2002,11,24), 0));
        theUserList.add(new ForumUser(5, "Piotr Piotrowski", 'M', LocalDate.of(1954,2,25), 23));
        theUserList.add(new ForumUser(6, "Tomasz Tomaszewski", 'M', LocalDate.of(1993,12,5), 6));
        theUserList.add(new ForumUser(7, "Agnieszka Nowak", 'F', LocalDate.of(2004,1,5), 4));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }

}
