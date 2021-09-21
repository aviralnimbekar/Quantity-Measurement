package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthEqualityTest {

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ftInComparison(1);
        Assertions.assertEquals(12, result);
    }

    @Test
    void given2FeetAnd24Inch_WhenCompared_ShouldReturnEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ftInComparison(2);
        Assertions.assertEquals(24, result);
    }

    @Test
    void given1FeetAnd22Inch_WhenCompared_ShouldReturnNotEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ftInComparison(1);
        Assertions.assertNotEquals(22, result);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ftYdComparison(3);
        Assertions.assertEquals(1, result);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ftYdComparison(1);
        Assertions.assertNotEquals(1, result);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.inYdComparison(1);
        Assertions.assertNotEquals(1, result);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ydInComparison(1);
        Assertions.assertEquals(36, result);
    }

    @Test
    void given36InchAnd1Yard_WhenCompared_ShouldReturnEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.inYdComparison(36);
        Assertions.assertEquals(1, result);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEqual() {
        LengthEquality length = new LengthEquality();
        double result = length.ydFtComparison(1);
        Assertions.assertEquals(3, result);
    }
}
