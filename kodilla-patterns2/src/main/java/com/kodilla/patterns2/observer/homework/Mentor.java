package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String firstname;
    private final String lastname;
    private int updateCount;

    public Mentor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(firstname + " " + lastname + ": New homeworks review in " + homeworkQueue.getName()
        + "\n" + " (total: " + homeworkQueue.getHomeworks().size() + " homeworks to review");
        updateCount++;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
