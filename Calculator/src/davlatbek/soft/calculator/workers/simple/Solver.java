package davlatbek.soft.calculator.workers.simple;

import davlatbek.soft.calculator.models.ConvertedObject;
import davlatbek.soft.calculator.models.SolvedObject;
import davlatbek.soft.calculator.models.enums.Exceptions;
import davlatbek.soft.calculator.models.enums.MathOperations;
import davlatbek.soft.calculator.models.enums.Numbers;
import davlatbek.soft.calculator.models.numbers.ArabicNumbers;
import davlatbek.soft.calculator.models.exceptions.ProjectExceptions;
import davlatbek.soft.calculator.models.numbers.RomanNumbers;
import davlatbek.soft.calculator.workers.static13.ExceptionsManager;

public class Solver {

    public static Solver getInstance() {
        return new Solver();
    }

    public SolvedObject solve(ConvertedObject objectForSolve)
            throws ArrayIndexOutOfBoundsException, ProjectExceptions {
        ConvertedObject solvingNow = objectForSolve;
        SolvedObject so = new SolvedObject();
        if (solvingNow.getFirstNumber() == -1) return so;
        so.setTypeOfNumbers(solvingNow.getTypeOfNumbers());
        so.setAnswer(solveExersice(solvingNow));
        so.setNumberForShowing(convertNumberAgainIfNeed(so.getTypeOfNumbers(), so.getAnswer()));
        return so;
    }

    private int solveExersice(ConvertedObject exercise) throws ProjectExceptions {
        MathOperations typeOfOperation = exercise.getMathOperation();
        int firstNumber = exercise.getFirstNumber();
        int secondNumber = exercise.getSecondNumber();
        int answer = 0;

        switch (typeOfOperation) {
            case Plus:
                answer = firstNumber + secondNumber;
                break;
            case Minus:
                answer = firstNumber - secondNumber;
                if (Integer.signum(answer) == -1)
                    throw ExceptionsManager.newException(
                            Exceptions.isNegativeException);
                break;
            case Multiple:
                answer = firstNumber * secondNumber;
                break;
            case Divide:
                if (secondNumber == 0)
                    throw ExceptionsManager.newException(
                            Exceptions.divideForZeroException);
                if (firstNumber % secondNumber != 0)
                    throw ExceptionsManager.newException(
                    Exceptions.isDoubleException);
                answer = firstNumber / secondNumber;
                break;
        }

        return answer;
    }


    private String convertNumberAgainIfNeed(Numbers typeOfNumbers, int numberToConvert)
            throws ArrayIndexOutOfBoundsException, ProjectExceptions {
        String result = "null";
        ArabicNumbers<String> arabicNumbers = new ArabicNumbers<>();
        RomanNumbers<String> romanNumbers = new RomanNumbers<>();

        if (typeOfNumbers == Numbers.Arabic) result = String.valueOf(numberToConvert);
        if (typeOfNumbers == Numbers.Roman) {
            int index = arabicNumbers.indexOf(String.valueOf(numberToConvert));
            result = romanNumbers.get(index);
        }
        if (result.equals(""))
                throw ExceptionsManager.newException(
                        Exceptions.zeroInRomanNumeralException);
        return result;
    }
}