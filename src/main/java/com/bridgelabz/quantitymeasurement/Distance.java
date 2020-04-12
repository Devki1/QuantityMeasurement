package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class Distance {
    Double distance;

    public Distance(Double distance, UnitMeasurements unit) {
        this.distance = unit.convertToBaseValue(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return Objects.equals(distance, distance1.distance);
    }
}
