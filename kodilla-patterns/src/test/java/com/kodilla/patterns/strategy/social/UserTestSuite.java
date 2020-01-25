package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User rob = new ZGeneration("Robert Townsend");

        //When
        String stevenPreferences = steven.sharePost();
        System.out.println("Steven is a user of: " + stevenPreferences);
        String johnPreferences = john.sharePost();
        System.out.println("John is a user of: " + johnPreferences);
        String robPreferences = rob.sharePost();
        System.out.println("Rob is a user of: " + robPreferences);

        //Then
        Assert.assertEquals("Snapchat", stevenPreferences);
        Assert.assertEquals("Twitter", johnPreferences);
        Assert.assertEquals("Facebook", robPreferences);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenPreferences = steven.sharePost();
        System.out.println("Steven is a user of: " + stevenPreferences);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenPreferences = steven.sharePost();
        System.out.println("Now Steven is a user of: " + stevenPreferences);

        //Then
        Assert.assertEquals("Twitter", stevenPreferences);
    }
}