package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        String log = "test log";
        //When
        Logger.getInstance().log(log);
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(log, lastLog);
    }
}