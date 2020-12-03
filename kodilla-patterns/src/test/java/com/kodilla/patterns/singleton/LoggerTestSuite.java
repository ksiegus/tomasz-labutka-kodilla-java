package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLogger() {
        logger = Logger.INSTANCE;
    }


    @Test
    void testGetLastLog() {
        //Given
        //When
        logger.log("Create file.");
        logger.log("Write to file.");
        logger.log("Close file.");

        String result = logger.getLastLog();

        //Then
        assertEquals("Close file.", result);
    }


}