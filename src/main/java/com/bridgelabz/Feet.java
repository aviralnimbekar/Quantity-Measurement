package com.bridgelabz;

public class Feet {
    private Double value;

    public Feet(Double value) {
        this.value = value;
    }

    public Feet() {
    }

    boolean lengthComparison(double ft, double in) {
        ft = 12 * ft;
        return ft == in;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}