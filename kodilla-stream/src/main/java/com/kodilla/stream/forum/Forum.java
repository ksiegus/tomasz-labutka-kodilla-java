package com.kodilla.stream.forum;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> users;

    public Forum(List<ForumUser> users) {
            this.users = users;
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(users);
    }

}
