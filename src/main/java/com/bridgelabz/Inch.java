package com.bridgelabz;

public class Inch {
    private final double value;

    public Inch(double inch) {
        this.value = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }
}
