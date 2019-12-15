package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 4);
        int subtractResult = calculator.subtract(10, 6);

        if (addResult == 14){
            System.out.println("Add method - test OK");
        } else {
            System.out.println("Add method - Error");
        }

        if (subtractResult == 4){
            System.out.println("Subtract method - test OK");
        } else {
            System.out.println("Subtract method - Error");
        }
    }
}