package davlatbek.soft.calculator.models;

import davlatbek.soft.calculator.models.enums.MathOperations;
import davlatbek.soft.calculator.models.enums.Numbers;

public class ParsedObject {
    private String inLine;
    private boolean isMathOperation = false;
    private MathOperations mathOperation = null;
    private int mathOperationIndex = -1;
    private Numbers typeOfNumbers = null;
    private String[] readyNumbers;



    public ParsedObject(String inLine) {
        setInLine(inLine);
        readyNumbers = new String[2];
        readyNumbers[0] = "null";
        readyNumbers[1] = "null";
    }

    public Numbers getTypeOfNumbers() {
        return typeOfNumbers;
    }

    public void setTypeOfNumbers(Numbers typeOfNumbers) {
        this.typeOfNumbers = typeOfNumbers;
    }

    public String getInLine() {
        return inLine;
    }

    public void setInLine(String inLine) {
        this.inLine = inLine;
    }

    public boolean getIsMathOperation() {
        return isMathOperation;
    }

    public void setIsMathOperation(boolean mathOperation) {
        isMathOperation = mathOperation;
    }

    public MathOperations getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(MathOperations mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int getMathOperationIndex() {
        return mathOperationIndex;
    }

    public void setMathOperationIndex(int mathOperationIndex) {
        this.mathOperationIndex = mathOperationIndex;
    }

    public String getFirstNumber() {
        return readyNumbers[0];
    }

    public String getSecondNumber() {
        return readyNumbers[1];
    }

    public void setReadyNumbers(String[] readyNumbers) {
        this.readyNumbers = readyNumbers;
    }

    @Override
    public String toString() {
        return "Parsed object properties:\r\n" +
                "inLine = \"" + getInLine() + "\"\r\n" +
                "isMathOperation = " + getIsMathOperation() + "\r\n" +
                "mathOperation = " + getMathOperation() + "\r\n" +
                "mathOperationIndex = " + getMathOperationIndex() + "\r\n" +
                "typeOfNumber = " + getTypeOfNumbers() + "\r\n" +
                "readyNumbers[2]:\r\n" +
                "firstNumber = " + getFirstNumber() + "\r\n" +
                "secondNumber = " + getSecondNumber();
    }
}
