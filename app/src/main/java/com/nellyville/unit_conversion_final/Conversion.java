package com.nellyville.unit_conversion_final;

public class Conversion {
    static final int FEET = 1;
    static final int INCHES = 2;
    static final int POUNDS = 3;
    static final int USD = 4;
    static final double FEET_TO_METERS = 0.3048;
    static final double INCHES_TO_CM = 2.56;
    static final double POUNDS_TO_GRAMS = 453.592;
    static final double USD_TO_PND = 0.75;

    private int isA;
    public String inputLabel;
    public String outputLabel;

    public Double inputValue;
    public Double outputValue;

    public Conversion() {
        isA = FEET;

        inputLabel = "Feet";
        outputLabel = "Meters";
        inputValue = 0.0;
        outputValue = 0.0;
    }

    public void switch_toFtM() {
        isA = FEET;
        inputLabel = "Feet";
        outputLabel = "Meters";
        compute();
    }

    public void switch_toInCm() {
        isA = INCHES;
        inputLabel = "Inches";
        outputLabel = "Centimeters";
        compute();
    }

    public void switch_toLbG() {
        isA = POUNDS;
        inputLabel = "Pounds";
        outputLabel = "Grams";
        compute();
    }

    public void switch_toUsdPnd() {
        isA = USD;
        inputLabel = "USD";
        outputLabel = "Pounds";
        compute();
    }

    public void compute() {
        switch (isA) {
            case FEET:
                outputValue = inputValue * FEET_TO_METERS;
                break;
            case INCHES:
                outputValue = inputValue * INCHES_TO_CM;
                break;
            case POUNDS:
                outputValue = inputValue * POUNDS_TO_GRAMS;
                break;
            case USD:
                outputValue = inputValue * USD_TO_PND;
                break;
        }
    }
}
