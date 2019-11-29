package davlatbek.soft.calculator.models;

import davlatbek.soft.calculator.models.enums.MathOperations;
import davlatbek.soft.calculator.models.enums.Numbers;

public class ConvertedObject {
    private int firstNumber = -1;
    private int secondNumber = -1;
    private MathOperations mathOperation = null;
    private Numbers typeOfNumbers = null;


    public Numbers getTypeOfNumbers() {
        return typeOfNumbers;
    }

    public void setTypeOfNumbers(Numbers typeOfNumbers) {
        this.typeOfNumbers = typeOfNumbers;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public MathOperations getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(MathOperations mathOperation) {
        this.mathOperation = mathOperation;
    }

    @Override
    public String toString() {
        return  "Parsed object properties:\r\n" +
                "firstNumber = " + getFirstNumber() + "\r\n" +
                "secondNumber = " + getSecondNumber() + "\r\n" +
                "typeOfNumber = " + getTypeOfNumbers() + "\r\n" +
                "mathOperation = " + getMathOperation() + "\r\n";
    }

}
