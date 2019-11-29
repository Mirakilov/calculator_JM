package davlatbek.soft.calculator.workers.simple;

import davlatbek.soft.calculator.models.exceptions.ProjectExceptions;
import davlatbek.soft.calculator.models.ParsedObject;
import davlatbek.soft.calculator.models.enums.Exceptions;
import davlatbek.soft.calculator.models.enums.MathOperations;
import davlatbek.soft.calculator.models.enums.Numbers;
import davlatbek.soft.calculator.models.numbers.ArabicNumbers;
import davlatbek.soft.calculator.models.numbers.RomanNumbers;
import davlatbek.soft.calculator.workers.static13.ExceptionsManager;

import static davlatbek.soft.calculator.models.enums.MathOperations.*;

public class Parser {
    public static Parser getInstance() {
        return new Parser();
    }

    public ParsedObject parse(String lineForParse) throws ProjectExceptions {
        String parsingNow = lineForParse.trim();
        ParsedObject po = new ParsedObject(parsingNow);
        if (!checkForMathable(parsingNow)) return po;
        po.setIsMathOperation(true);
        po.setMathOperation(matchMathOperation(parsingNow));
        po.setMathOperationIndex(findMathOperationIndex(parsingNow));
        po.setTypeOfNumbers(matchTypeOfNumber(parsingNow));
        po.setReadyNumbers(joinNums(parsingNow));
        return po;
    }

    private boolean checkForMathable(String lineForCheck) throws ProjectExceptions {
        boolean result = true;
        if (!isSomethingEntered(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.nothingEnteredException);
        }

        if (!haveProbels(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.haveProbelsException);
        }

        if (!isOnlyOneMathOperation(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.isOnlyOneMathOperationException);
        }

        if (!consistOnlyNeededNumbers(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.consistOnlyNeededNumbersException);
        }
        if (!haveMathOperation(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.haveMathOperationException);
        }

        if (!haveTwoNumbers(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.haveTwoNumbersException);
        }

        if (!isOnlyOneTypeOfNumbers(lineForCheck)) {
            throw ExceptionsManager.newException(
                    Exceptions.isOnlyOneTypeOfNumbersException);
        }


        return result;
    }

    private MathOperations matchMathOperation(String lineForMatch) {
        MathOperations result = null;
        for (char breakingUp : stringToCharArray(lineForMatch)) {
            switch (breakingUp) {
                case '+':
                    result = Plus;
                    break;
                case '-':
                    result = Minus;
                    break;
                case '*':
                    result = Multiple;
                    break;
                case '/':
                    result = Divide;
                    break;
            }
            if (result != null) break;
        }
        return result;
    }

    private Numbers matchTypeOfNumber(String lineForMatch) {
        Numbers result = null;

        ArabicNumbers<String> arabicNumbers = new ArabicNumbers<>();
        RomanNumbers<String> romanNumbers = new RomanNumbers<>();

        String[] numbers = joinNums(lineForMatch);
        if (arabicNumbers.indexOf(numbers[0]) != -1) result = Numbers.Arabic;
        if (romanNumbers.indexOf(numbers[0]) != -1) result = Numbers.Roman;
        return result;
    }

    private int findMathOperationIndex(String lineForCheck) {
        int result = 0;
        boolean checker = false;
        for (char breakingUp : stringToCharArray(lineForCheck)) {
            if (breakingUp == '+' || breakingUp == '-'
                    || breakingUp == '*' || breakingUp == '/') {
                checker = true;
                break;
            }
            result++;
        }
        if (!checker) result = -1;
        return result;
    }

    private String[] joinNums(String lineForParseAndJoin) {
        int letterIndex = 0, numberIndex = 0;
        String[] nums = new String[2];
        nums[0] = "";
        nums[1] = "";
        for (char breakingUp : stringToCharArray(lineForParseAndJoin)) {
            if (letterIndex == findMathOperationIndex(lineForParseAndJoin)) {
                numberIndex++;
                letterIndex += 1;
                continue;
            }
            nums[numberIndex] += breakingUp;
            letterIndex++;
        }
        return nums;
    }

    private boolean haveProbels(String lineForCheck) {
        boolean result = true;
        for (char breakingUp : stringToCharArray(lineForCheck)) {
            if (breakingUp == ' ') result = false;
        }
        return result;
    }

    private boolean haveTwoNumbers(String lineForCheck) {
        boolean result = true;
        String[] numbers = joinNums(lineForCheck);
        for (String number : numbers) {
            if (number.equals("")) result = false;
        }
        return result;
    }

    private boolean isOnlyOneMathOperation(String lineForCheck) {
        boolean result = true;
        int i = 0;
        for (char breakingUp : stringToCharArray(lineForCheck)) {
            switch (breakingUp) {
                case '+':
                    i++;
                    break;
                case '-':
                    i++;
                    break;
                case '*':
                    i++;
                    break;
                case '/':
                    i++;
                    break;
            }
        }
        if (i > 1) result = false;
        return result;
    }

    private boolean consistOnlyNeededNumbers(String lineForCheck) {
        boolean result = true;

        ArabicNumbers<String> arabicNumbers = new ArabicNumbers<>();
        RomanNumbers<String> romanNumbers = new RomanNumbers<>();

        String[] parsingNow = joinNums(lineForCheck);
        for (String number : parsingNow) {
            if (number.equals("")) break;
            if (number.equals(Plus) ||
                    number.equals(Minus) ||
                    number.equals(Multiple) ||
                    number.equals(Divide)) break;
            if ((arabicNumbers.indexOf(number) == -1 && romanNumbers.indexOf(number) == -1) ||
                    (arabicNumbers.indexOf(number) >= 11 || romanNumbers.indexOf(number) >= 11)) result = false;
        }

        return result;
    }

    private boolean isOnlyOneTypeOfNumbers(String lineForCheck) {
        boolean result = true;
        boolean arabic = false;
        boolean roman = false;
        ArabicNumbers<String> arabicNumbers = new ArabicNumbers<>();
        RomanNumbers<String> romanNumbers = new RomanNumbers<>();

        String[] numbers = joinNums(lineForCheck);
        for (String number : numbers) {
            if (arabicNumbers.indexOf(number) != -1) arabic = true;
            if (romanNumbers.indexOf(number) != -1) roman = true;
        }
        if (roman && arabic) result = false;
        return result;
    }

    private boolean haveMathOperation(String lineForCheck) {
        boolean result = true;
        if (matchMathOperation(lineForCheck) == null) result = false;
        return result;
    }

    private boolean isSomethingEntered(String lineForCheck) {
        boolean result = true;
        if (lineForCheck.equals("")) result = false;
        return result;
    }

    private char[] stringToCharArray(String lineForConvert) {
        return lineForConvert.toCharArray();
    }
}
