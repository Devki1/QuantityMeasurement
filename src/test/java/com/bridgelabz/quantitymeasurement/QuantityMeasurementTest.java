package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        Feet feet3 = new Feet(15);
        String result1 = quantityMeasurement.compare(feet1, feet2);
        String result2 = quantityMeasurement.compare(feet2, feet3);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }

}
