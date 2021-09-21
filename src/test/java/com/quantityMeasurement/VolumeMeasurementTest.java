package com.quantityMeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeMeasurementTest {

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd2Gallon_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 2.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAndNull_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1GallonFromDiffRef_ShouldReturnNotEqualVolume() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
        Volume volume = new Volume(Volume.Unit.GALLON, 1.0);
        Length length = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(volume, length);
    }

    @Test
    void give0LiterAnd0Liter_ShouldReturnEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    void give1LiterAnd2Liter_ShouldReturnNotEqualVolume() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }
}
