package com.example.slm_example;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Test
    void calculateHammingWeightTest() {
        // Arrange
        String inputString = "012012";

        // Act
        int result = s.calculateHammingWeight(inputString);

        // Assert
        assertEquals(4, result);

    }
}