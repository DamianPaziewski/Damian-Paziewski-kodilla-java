package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 1.5));
        } catch (Exception e) {
            System.out.println("Error occured: " + e);
        } finally {
            System.out.println("Thanks");
        }
    }
}