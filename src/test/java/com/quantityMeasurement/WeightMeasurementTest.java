package com.quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightMeasurementTest {

    @Test
    void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNull_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        Weight weight = new Weight(Weight.Unit.GRAM, 0.0);
        Volume volume = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }
}
