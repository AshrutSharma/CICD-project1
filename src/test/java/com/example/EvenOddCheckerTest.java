package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddCheckerTest {
    @Test
    void testIsEven() {
        assertTrue(EvenOddChecker.isEven(2));
        assertTrue(EvenOddChecker.isEven(4));
        assertTrue(EvenOddChecker.isEven(7));
        assertFalse(EvenOddChecker.isEven(3));
        assertFalse(EvenOddChecker.isEven(5));
    }
}
