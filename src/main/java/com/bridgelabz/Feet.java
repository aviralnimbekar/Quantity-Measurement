package com.bridgelabz;

public class Feet {
    Double value;

    public Feet(Double value) {
        this.value = value;
    }

    public Feet() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}