package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetAndFeetFromSameRef_WhenEqual_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        boolean actual = feet1 == feet1;    // '==' operator is for ref obj
        Assertions.assertTrue(actual);
    }

    @Test
    void givenFeetAndFeetFromDiffRef_WhenNotEqual_ShouldReturnFalse() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        boolean actual = feet1 == feet2;   // '==' operator is for ref obj
        Assertions.assertFalse(actual);
    }
}
