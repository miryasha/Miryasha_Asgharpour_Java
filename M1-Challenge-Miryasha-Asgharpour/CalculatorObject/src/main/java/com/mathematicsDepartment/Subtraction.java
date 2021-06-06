package com.mathematicsDepartment;

public class Subtraction {
    private double inputNum1;
    private double getInputNum2;

    public Subtraction (double inputNum1, double getInputNum2){
        this.inputNum1 = inputNum1;
        this.getInputNum2 = getInputNum2;
    }

    public double subtractor(){
        return inputNum1 - getInputNum2;
    }

    public double getInputNum1() {
        return inputNum1;
    }

    public double getGetInputNum2() {
        return getInputNum2;
    }
}
