package com.bridgelabz;

public class Yard {
    double value;

    public Yard(double yard) {
        this.value = yard;
    }

    public Yard() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yard yard1 = (Yard) o;
        return Double.compare(yard1.value, value) == 0;
    }
}
