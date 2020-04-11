package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {
    public String compare(Feet feet1, Feet feet2) {
        if (feet1.equals(feet2))
            return "equal";
        return "not equal";
    }
    public boolean compareInch(Inch inch1 , Inch inch2)
    {
        if(inch1.equals(inch2))
            return  true;
        return false;
    }
}


