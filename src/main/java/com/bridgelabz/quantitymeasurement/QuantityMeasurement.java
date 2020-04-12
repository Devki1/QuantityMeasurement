package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {
    public boolean compare(Distance value1, Distance value2) {
        if (value1.equals(value2))
            return true;
        return false;
    }

    public Double addTwoLengths(Distance value1, Distance value2) {
        return value1.distance + value2.distance;
    }
}
