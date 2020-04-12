package com.bridgelabz.quantitymeasurement;

public enum UnitMeasurements {
    FEET(12),INCH(1),
    YARD(36),CENTIMETER(0.4),
    GALLON(3.78), LITRES(1), MILLILITERS(0.001),
    KILOGRAMS(1.0), GRAMS(0.001), TONNE(1000),
    FAHRENHEIT(1), CELSIUS(2.12);
    Double baseValue;
    UnitMeasurements(double baseValue) {
        this.baseValue = baseValue;
    }

    public Double convertToBaseValue(Double distance) {
        return distance * baseValue;
    }
}


