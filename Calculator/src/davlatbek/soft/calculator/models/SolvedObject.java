package davlatbek.soft.calculator.models;

import davlatbek.soft.calculator.models.enums.Numbers;

public class SolvedObject {
    private Numbers typeOfNumbers = null;
    private int answer = -1;
    private String numberForShowing = "null";


    public String getNumberForShowing() {
        return numberForShowing;
    }

    public void setNumberForShowing(String typeOfNumberForShowing) {
        this.numberForShowing = typeOfNumberForShowing;
    }

    public Numbers getTypeOfNumbers() {
        return typeOfNumbers;
    }

    public void setTypeOfNumbers(Numbers typeOfNumbers) {
        this.typeOfNumbers = typeOfNumbers;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Parsed object properties:\r\n" +
                "numberForShowing = \"" + getNumberForShowing() + "\"\r\n" +
                "typeOfNumber = " + getTypeOfNumbers() + "\r\n" +
                "answer = " + getAnswer();

    }
}
