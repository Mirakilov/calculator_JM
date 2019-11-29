package davlatbek.soft.calculator.workers.static13;

import davlatbek.soft.calculator.models.enums.Exceptions;
import davlatbek.soft.calculator.models.exceptions.ProjectExceptions;

public class ExceptionsManager {

    public static ProjectExceptions newException(Exceptions typeOfException) {
        String message = matchMessage(typeOfException);
        return createNewException(typeOfException, message);
    }

    private static ProjectExceptions createNewException(
            Exceptions typeOfException, String message) {
        return new ProjectExceptions(typeOfException, message);
    }

    private static String matchMessage(Exceptions typeOfException) {
        String result = "null";
        switch (typeOfException) {
            case haveProbelsException:
                result = Documentator.getHaveProbelsException();
                break;
            case haveTwoNumbersException:
                result = Documentator.getHaveTwoNumbersException();
                break;
            case haveMathOperationException:
                result = Documentator.getHaveMathOperationException();
                break;
            case isOnlyOneMathOperationException:
                result = Documentator.getIsOnlyOneMathOperationException();
                break;
            case isOnlyOneTypeOfNumbersException:
                result = Documentator.getIsOnlyOneTypeOfNumbersException();
                break;
            case consistOnlyNeededNumbersException:
                result = Documentator.getConsistOnlyNeededNumbersException();
                break;
            case isDoubleException:
                result = Documentator.getIsDoubleException();
                break;
            case isNegativeException:
                result = Documentator.getIsNegativeException();
                break;
            case divideForZeroException:
                result = Documentator.getDivideForZeroException();
                break;
            case zeroInRomanNumeralException:
                result = Documentator.getZeroInRomanNumeralException();
                break;
            case nothingEnteredException:
                result = Documentator.getNothingEnteredException();
                break;
        }
        return result;
    }

}
