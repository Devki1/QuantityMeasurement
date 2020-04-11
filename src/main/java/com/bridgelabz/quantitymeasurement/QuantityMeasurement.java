package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {
    public String compare(Feet feet1, Feet feet2) {
        if (feet1.equals(feet2))
            return "equal";
        return "not equal";
    }
}


