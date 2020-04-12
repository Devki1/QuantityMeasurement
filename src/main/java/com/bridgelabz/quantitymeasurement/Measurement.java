package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class Measurement {
    Double distance;

    public Measurement(Double distance, UnitMeasurements unit) {
        this.distance = unit.convertToBaseValue(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement distance1 = (Measurement) o;
        return Objects.equals(distance, distance1.distance);
    }
}
