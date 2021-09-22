package com.quantityMeasurement;

public enum Unit {
    CENTI_METER(1 / 2.5), INCH(1), FEET(12), YARD(36);

    private final double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public double covertToBaseUnit(Length obj) {
        return obj.value * obj.unit.baseUnitConversion;
    }
}
