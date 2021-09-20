package com.bridgelabz;

public class Inch {
    private double value;

    public Inch(double inch) {
        this.value = inch;
    }

    public Inch() {
    }

    public boolean lengthComparison(double in, int ft) {
        ft = ft * 12;
        return ft == in;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }
}