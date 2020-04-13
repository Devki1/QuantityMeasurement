package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.MeasurementQuantity;
import com.bridgelabz.quantitymeasurement.utility.UnitMeasurements;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurementService quantityMeasurement = new QuantityMeasurementService();

    @Test
    public void givenTwoFeetValues_IfCompared_ShouldReturnAppropriateResult() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, UnitMeasurements.FEET);
        MeasurementQuantity thirdValue = new MeasurementQuantity(5.0, UnitMeasurements.FEET);
        boolean result1 = quantityMeasurement.compare(firstValue, secondValue);
        boolean result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }

    @Test
    public void givenTwoFeetObjects_IfOneOfThemIsNull_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.FEET);
            boolean result = quantityMeasurement.compare(firstValue, null);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoFeetObjects_IfObjectsAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfBothOfThemAreNull_ShouldThrowException() {
        try {
            quantityMeasurement.compare(null, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoObjects_IfTypeIsSame_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoObjects_IfValuesAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(12.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(12.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValues_IfCompared_ShouldReturnAppropriateResult() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, UnitMeasurements.INCH);
        MeasurementQuantity thirdValue = new MeasurementQuantity(5.0, UnitMeasurements.INCH);
        boolean result1 = quantityMeasurement.compare(firstValue, secondValue);
        boolean result2 = quantityMeasurement.compare(firstValue, thirdValue);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }

    @Test
    public void givenTwoInchObjects_IfOneOfThemIsNull_ShouldReturnTrue() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.INCH);
            boolean result = quantityMeasurement.compare(firstValue, null);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoInchObjects_IfObjectsAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchObjects_IfTypeIsSame_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(0.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(0.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchObjects_IfValuesAreSame_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(12.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(12.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(3.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1FeetAndOneYard_ShouldReturnFalse() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1InchAnd1Yard_ShouldNotReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void given1YardAnd36Inch_ShouldNotReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.YARD);
        MeasurementQuantity secondValue = new MeasurementQuantity(36.0, UnitMeasurements.INCH);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(36.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, UnitMeasurements.YARD);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.YARD);
        MeasurementQuantity secondValue = new MeasurementQuantity(3.0, UnitMeasurements.FEET);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(2.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(5.0, UnitMeasurements.CENTIMETER);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValues_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(2.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(2.0, UnitMeasurements.INCH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(2.0, UnitMeasurements.INCH);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(14.0, result, 0.0);
    }

    @Test
    public void givenTwoFeetValues_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.FEET);
        MeasurementQuantity secondValue = new MeasurementQuantity(1.0, UnitMeasurements.FEET);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(24.0, result, 0.0);
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_WhenAdded_ShouldReturnResultInInch() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(2.0, UnitMeasurements.INCH);
        MeasurementQuantity secondValue = new MeasurementQuantity(2.5, UnitMeasurements.CENTIMETER);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(3.0, result, 0.0);
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_IfOneOfThemIsNull_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(2.0, UnitMeasurements.INCH);
            Double result = quantityMeasurement.addTwoValues(firstValue, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenOneInchAndOneCentimeterValue_IfBothOfThemAreNull_ShouldThrowException() {
        try {
            Double result = quantityMeasurement.addTwoValues(null, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenOneGallonAndOneLitreValue_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.GALLON);
        MeasurementQuantity secondValue = new MeasurementQuantity(3.78, UnitMeasurements.LITRES);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.LITRES);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, UnitMeasurements.MILLILITERS);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneGallonAndOneLitreValue_WhenAdded_ShouldReturnResultInLitres() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.GALLON);
        MeasurementQuantity secondValue = new MeasurementQuantity(3.78, UnitMeasurements.LITRES);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_WhenAdded_ShouldReturnResultInLitres() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.LITRES);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, UnitMeasurements.MILLILITERS);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(2.0, result, 0.0);
    }

    @Test
    public void givenOneKilogramValueAndOneGramValue_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.KILOGRAMS);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, UnitMeasurements.GRAMS);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneTonneValueAndOneKilogramValue_IfEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.TONNE);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, UnitMeasurements.KILOGRAMS);
        boolean result = quantityMeasurement.compare(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenOneTonneAndOneGramValue_WhenAdded_ShouldReturnResultInKilogram() throws QuantityMeasurementException {
        MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.TONNE);
        MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, UnitMeasurements.GRAMS);
        Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(1001.0, result, 0.0);
    }

    @Test
    public void givenTemperatureInCelsiusAndFahrenheit_IfEqual_ShouldReturnTrue() {
        MeasurementQuantity firstValue = new MeasurementQuantity(212.0, UnitMeasurements.FAHRENHEIT);
        MeasurementQuantity secondValue = new MeasurementQuantity(100.0, UnitMeasurements.CELSIUS);
        Assert.assertEquals(firstValue.quantity, 100.0, 0.0);
        Assert.assertEquals(secondValue.quantity, 212.0, 0.0);
    }

    @Test
    public void givenTwoObjects_IfMeasurementTypesAreNotEqual_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(212.0, UnitMeasurements.FAHRENHEIT);
            MeasurementQuantity secondValue = new MeasurementQuantity(100.0, UnitMeasurements.CELSIUS);
            quantityMeasurement.compare(firstValue, secondValue);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.MISMATCHED_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoObjects_IfOneOfThemIsNull_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(212.0, UnitMeasurements.FAHRENHEIT);
            quantityMeasurement.compare(null, firstValue);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenTwoValues_IfMeasurementTypesAreNotEqualWhileAddition_ShouldThrowException() {
        try {
            MeasurementQuantity firstValue = new MeasurementQuantity(1.0, UnitMeasurements.TONNE);
            MeasurementQuantity secondValue = new MeasurementQuantity(1000.0, UnitMeasurements.GRAMS);
            Double result = quantityMeasurement.addTwoValues(firstValue, secondValue);
            Assert.assertEquals(1001.0, result, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.MISMATCHED_VALUE, e.type);
        }
    }
}