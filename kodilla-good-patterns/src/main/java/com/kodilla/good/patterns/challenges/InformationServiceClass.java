package com.kodilla.good.patterns.challenges;

public class InformationServiceClass implements InformationService {
    public void inform(User user) {
        System.out.println("Send e-mail to " + user.getFirstName() + " " + user.getLastName() + " with order information.");
    }
}
