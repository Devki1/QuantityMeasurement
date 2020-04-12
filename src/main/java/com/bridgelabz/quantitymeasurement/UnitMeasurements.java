package com.bridgelabz.quantitymeasurement;

public enum UnitMeasurements {
    FEET(12),INCH(1),
    YARD(36);

    Double baseValue;
    UnitMeasurements(double baseValue) {
        this.baseValue = baseValue;
    }

    public Double convertToBaseValue(Double distance) {
        return distance * baseValue;
    }
}


