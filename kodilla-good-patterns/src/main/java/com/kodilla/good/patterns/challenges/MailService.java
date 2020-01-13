package com.kodilla.good.patterns.challenges;

public class MailService implements InfoService {

        @Override
        public void inform(User user) {
            System.out.println("Thank You " + user.getNickname() + " for your order!");
        }
}