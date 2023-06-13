package com.example.slm_example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlmExampleControllerTest {
    SlmExampleController s = new SlmExampleController();

    @Test
    public void testGetPreviousString() {
        // Arrange
        int expected = 0;

        // Act
        int actual = s.getPreviousString();

        // Assert
        assertEquals(expected, actual);
    }
}