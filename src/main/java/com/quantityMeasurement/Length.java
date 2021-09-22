package com.quantityMeasurement;

public class Length {
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
        double sumOfInput = this.unit.covertToBaseUnit(this) + that.unit.covertToBaseUnit(that);
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