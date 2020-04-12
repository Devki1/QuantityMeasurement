package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import java.lang.invoke.VarHandle;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() {
        Distance value1 = new Distance(0.0, UnitMeasurements.FEET);
        Distance value2 = new Distance(0.0,   UnitMeasurements.FEET);
        Distance value3 = new Distance(7.0, UnitMeasurements.FEET);
        boolean result1 = quantityMeasurement.compare(value1,value2);
        boolean result2 = quantityMeasurement.compare(value1, value3);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldReturnFalse() {
        Distance value1 = new Distance(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnTrue() {
        Distance value1 = new Distance(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, value1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnTrue() {
        Distance value1 = new Distance(0.0, UnitMeasurements.FEET);
        Distance value2 = new Distance(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnTrue() {
        Distance value1 = new Distance(12.0,UnitMeasurements.FEET);
        Distance value2 = new Distance(12.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnResult() {
        Distance value1 = new Distance(0.0, UnitMeasurements.INCH);
        Distance value2 = new Distance(0.0,   UnitMeasurements.INCH);
        Distance value3 = new Distance(7.0, UnitMeasurements.INCH);
        boolean result1 = quantityMeasurement.compare(value1,value2);
        boolean result2 = quantityMeasurement.compare(value1, value3);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnFalse() {
        Distance value1 = new Distance(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenTwoInchObjects_IfObjectsAreSame_ShouldReturnTrue() {
        Distance value1 = new Distance(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, value1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObject_IfTypeIsSame_ShouldReturnTrue() {
        Distance value1 = new Distance(0.0, UnitMeasurements.INCH);
        Distance value2 = new Distance(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObject_IfValuesAreSame_ShouldReturnTrue() {
        Distance value1 = new Distance(12.0,UnitMeasurements.INCH);
        Distance value2 = new Distance(12.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }


    @Test
    public void givenThreeFeetAnd1Yard_ShouldReturnTrue() {
        Distance value1 = new Distance(3.0, UnitMeasurements.FEET);
        Distance value2 = new Distance(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1FeetAndOneYard_ShouldReturnFalse() {
        Distance value1 = new Distance(1.0, UnitMeasurements.FEET);
        Distance value2 = new Distance(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1 ,value2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldNotReturnTrue() {
        Distance value1 = new Distance(1.0, UnitMeasurements.INCH);
        Distance value2 = new Distance(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1 , value2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldNotReturnTrue() {
        Distance value1 = new Distance(1.0, UnitMeasurements.YARD);
        Distance value2 = new Distance(36.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1 , value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() {
        Distance value1 = new Distance(36.0, UnitMeasurements.INCH);
        Distance value2 = new Distance(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1 , value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() {
        Distance value1 = new Distance(1.0, UnitMeasurements.YARD);
        Distance value2 = new Distance(3.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }
    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() {
        Distance value1 = new Distance(2.0, UnitMeasurements.INCH);
        Distance value2 = new Distance(5.0, UnitMeasurements.CENTIMETER);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }
}