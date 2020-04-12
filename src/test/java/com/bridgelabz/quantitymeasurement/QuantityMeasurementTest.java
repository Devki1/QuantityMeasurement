package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(0.0, UnitMeasurements.FEET);
        Measurement value3 = new Measurement(7.0, UnitMeasurements.FEET);
        boolean result1 = quantityMeasurement.compare(value1, value2);
        boolean result2 = quantityMeasurement.compare(value1, value3);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldReturnFalse() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnTrue() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, value1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnTrue() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnTrue() {
        Measurement value1 = new Measurement(12.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(12.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnResult() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(0.0, UnitMeasurements.INCH);
        Measurement value3 = new Measurement(7.0, UnitMeasurements.INCH);
        boolean result1 = quantityMeasurement.compare(value1, value2);
        boolean result2 = quantityMeasurement.compare(value1, value3);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnFalse() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenTwoInchObjects_IfObjectsAreSame_ShouldReturnTrue() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, value1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObject_IfTypeIsSame_ShouldReturnTrue() {
        Measurement value1 = new Measurement(0.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObject_IfValuesAreSame_ShouldReturnTrue() {
        Measurement value1 = new Measurement(12.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(12.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }


    @Test
    public void givenThreeFeetAnd1Yard_ShouldReturnTrue() {
        Measurement value1 = new Measurement(3.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1FeetAndOneYard_ShouldReturnFalse() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldNotReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldNotReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.YARD);
        Measurement value2 = new Measurement(36.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() {
        Measurement value1 = new Measurement(36.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.YARD);
        Measurement value2 = new Measurement(3.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() {
        Measurement value1 = new Measurement(2.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(5.0, UnitMeasurements.CENTIMETER);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValues_WhenAdded_ShouldReturnResultInInch() {
        Measurement value1 = new Measurement(2.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(2.0, UnitMeasurements.INCH);
        Double result = quantityMeasurement.addTwoLengths(value1, value2);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenAdded_ShouldReturnResultInInch() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(2.0, UnitMeasurements.INCH);
        Double result = quantityMeasurement.addTwoLengths(value1, value2);
        Assert.assertEquals(14.0, result, 0.0);
    }

    @Test
    public void givenTwoFeetValues_WhenAdded_ShouldReturnResultInInch() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.FEET);
        Measurement value2 = new Measurement(1.0, UnitMeasurements.FEET);
        Double result = quantityMeasurement.addTwoLengths(value1, value2);
        Assert.assertEquals(24.0, result, 0.0);
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_WhenAdded_ShouldReturnResultInInch() {
        Measurement value1 = new Measurement(2.0, UnitMeasurements.INCH);
        Measurement value2 = new Measurement(2.5, UnitMeasurements.CENTIMETER);
        Double result = quantityMeasurement.addTwoLengths(value1, value2);
        Assert.assertEquals(3.0, result, 0.0);
    }

    @Test
    public void givenOneGallonAndOneLitreValue_IfEqual_ShouldReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.GALLON);
        Measurement value2 = new Measurement(3.78,UnitMeasurements.LITRES);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_IfEqual_ShouldReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.LITRES);
        Measurement value2 = new Measurement(1000.0, UnitMeasurements.MILLILITERS);
        boolean result = quantityMeasurement.compare(value1 , value2);
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenOneGallonAndOneLitreValue_WhenAdded_ShouldReturnResultInLitres() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.GALLON);
        Measurement value2 = new Measurement(3.78, UnitMeasurements.LITRES);
        Double result = quantityMeasurement.addTwoLengths(value1,value2);
        Assert.assertEquals(7.56, result, 0.0);
    }
    @Test
    public void given1LitreAnd1MillilitreValue_WhenAdded_ShouldReturnResultInLitres() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.LITRES);
        Measurement value2 = new Measurement(1000.0, UnitMeasurements.MILLILITERS);
        Double result = quantityMeasurement.addTwoLengths(value1, value2);
        Assert.assertEquals(2.0, result, 0.0);
    }
    @Test
    public void givenOneKilogramValueAndOneGramValue_IfEqual_ShouldReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.KILOGRAMS);
        Measurement value2 = new Measurement(1000.0,UnitMeasurements.GRAMS);
        boolean result = quantityMeasurement.compare(value1,value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneTonneValueAndOneKilogramValue_IfEqual_ShouldReturnTrue() {
        Measurement value1 = new Measurement(1.0, UnitMeasurements.TONNE);
        Measurement value2 = new Measurement(1000.0, UnitMeasurements.KILOGRAMS);
        boolean result = quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneTonneAndOneGramValue_WhenAdded_ShouldReturnResultInKilogram() {
        Measurement value1  = new Measurement(1.0, UnitMeasurements.TONNE);
        Measurement value2 = new Measurement(1000.0, UnitMeasurements.GRAMS);
        Double result = quantityMeasurement.addTwoLengths(value1 , value2);
        Assert.assertEquals(1001.0, result, 0.0);
    }
}

