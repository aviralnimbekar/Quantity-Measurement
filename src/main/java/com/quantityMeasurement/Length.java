package com.quantityMeasurement;

public class Length {

    private static final double INCH_TO_CM = 2.5;
    private static final double FEET_TO_INCH = 12.0;
    public double value;
    public Unit unit;

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.covertToBaseUnit(this), that.unit.covertToBaseUnit(that)) == 0;
    }

    public Length sumOfLength(Length that) {
        double sumOfInput = 0.0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            sumOfInput = this.value + that.value;
        else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            sumOfInput = this.value * FEET_TO_INCH + that.value;
        else if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            sumOfInput = this.value * FEET_TO_INCH + that.value * FEET_TO_INCH;
        else if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTI_METER))
            sumOfInput = this.value + that.value / INCH_TO_CM;
        return new Length(Unit.INCH, sumOfInput);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}