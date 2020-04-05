package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkPlatformTestSuite {
    @Test
    public void testHomeworkPlatformUpdate() {
        //Given
        HomeworkQueue johnSmithHomeworks = new HomeworkQueue("Learner #1");
        HomeworkQueue allanAlliHomewroks = new HomeworkQueue("Learner #2");
        HomeworkQueue emilyWhitehouseHomeworks = new HomeworkQueue("Learner #3");
        Mentor mentor1 = new Mentor("William", "Think");
        Mentor mentor2 = new Mentor("Barbara", "Brain");
        johnSmithHomeworks.registerObserver(mentor1);
        allanAlliHomewroks.registerObserver(mentor1);
        emilyWhitehouseHomeworks.registerObserver(mentor2);
        //When
        johnSmithHomeworks.addHomework("6.5 - BookLibrary Mock");
        allanAlliHomewroks.addHomework("6.4 - ShapeCollector");
        emilyWhitehouseHomeworks.addHomework("1.1 - index.html");
        johnSmithHomeworks.addHomework("8.1 - Spring Web solution");
        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}