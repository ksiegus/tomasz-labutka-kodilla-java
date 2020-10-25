package com.kodilla.stream.forum;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate bornDate;
    private final int postCount;

    public ForumUser(final int id, final String username, final char sex, final LocalDate bornDate, final int postCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.bornDate = bornDate;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", bornDate='" + bornDate + '\'' +
                ", postCount='" + postCount + '\'' +
                '}';
    }

}
