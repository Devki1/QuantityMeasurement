package com.bridgelabz.quantitymeasurement;

public class Inch {
    Double length;
    public Inch(double length)
    {
        this.length = length;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.length, length) == 0;
    }
}
