package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.MeasurementQuantity;

import java.util.Objects;

public class QuantityMeasurementService {
    public boolean compare(MeasurementQuantity firstValue, MeasurementQuantity secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Entered null value");
        if (firstValue.type != secondValue.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.MISMATCHED_VALUE, "Value mismatch");
        return !Objects.equals(firstValue, secondValue) ? false : true;
    }

    public Double addTwoValues(MeasurementQuantity firstValue, MeasurementQuantity secondValue) throws QuantityMeasurementException {
        if (firstValue == null || secondValue == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_VALUE, "Enter null value");
        if (firstValue.type != secondValue.type)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.MISMATCHED_VALUE, "Type mismatch");
        return firstValue.quantity + secondValue.quantity;
    }
}