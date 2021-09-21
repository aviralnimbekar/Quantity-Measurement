package com.bridgelabz;

public class LengthEquality {

    public double ftInComparison(double ft) {
        Inch inch = new Inch(12);
        Feet feet = new Feet(ft);
        feet.value = feet.value * inch.value;
        return feet.value;
    }

    public double ftYdComparison(double ft) {
        Feet feet = new Feet(ft);
        Yard yard = new Yard();
        yard.value = feet.value / 3;
        return yard.value;
    }

    public double inYdComparison(double in) {
        Inch inch = new Inch(in);
        Yard yard = new Yard();
        yard.value = inch.value / 36;
        return yard.value;
    }

    public double ydInComparison(double yd) {
        Yard yard = new Yard(yd);
        Inch inch = new Inch();
        inch.value = yard.value * 36;
        return inch.value;
    }

    public double ydFtComparison(double yd) {
        Yard yard = new Yard(yd);
        Feet feet = new Feet();
        feet.value = yard.value * 3;
        return feet.value;
    }
}
