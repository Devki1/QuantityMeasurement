package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    @Test
    public void givenLengthsInFeet_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Feet feet3 = new Feet(15.0);
        String result1 = quantityMeasurement.compare(feet1, feet2);
        String result2 = quantityMeasurement.compare(feet2, feet3);
        Assert.assertEquals("equal", result1);
        Assert.assertEquals("not equal", result2);
    }
    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        String result1 = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals("not equal", result1);
    }
    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        String result1 = quantityMeasurement.compare(feet1, feet1);
        Assert.assertEquals("equal", result1);
    }
    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnResult() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        String result1 = quantityMeasurement.compare(feet1, feet2);
        Assert.assertEquals("equal", result1);
    }
}


