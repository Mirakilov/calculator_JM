package davlatbek.soft.calculator.workers.simple;

import davlatbek.soft.calculator.models.ConvertedObject;
import davlatbek.soft.calculator.models.ParsedObject;
import davlatbek.soft.calculator.models.enums.Numbers;
import davlatbek.soft.calculator.models.numbers.ArabicNumbers;
import davlatbek.soft.calculator.models.numbers.RomanNumbers;

public class Converter {
    public static Converter getInstance() {
        return new Converter();
    }

    public ConvertedObject convert(ParsedObject parsedObjectForConvert) {
        ConvertedObject co = new ConvertedObject();
        ParsedObject convertingNow = parsedObjectForConvert;
        if (!convertingNow.getIsMathOperation()) return co;
        co.setTypeOfNumbers(convertingNow.getTypeOfNumbers());
        co.setMathOperation(convertingNow.getMathOperation());
        co.setFirstNumber(getFirst(convertingNow));
        co.setSecondNumber(getSecond(convertingNow));
        return co;
    }

    private String convertNumberIfNeed(String numberToConvert) {
        String result = "null";
        ArabicNumbers<String> arabicNumbers = new ArabicNumbers<>();
        RomanNumbers<String> romanNumbers = new RomanNumbers<>();

        if (matchTypeOfNumber(numberToConvert) == Numbers.Arabic) result = numberToConvert;
        if (matchTypeOfNumber(numberToConvert) == Numbers.Roman) {
            int index = romanNumbers.indexOf(numberToConvert);
            result = arabicNumbers.get(index);
        }
        return result;
    }

    ;

    private int getIntegerNumber(String numberToConverting) {
        return Integer.parseInt(convertNumberIfNeed(numberToConverting));
    }

    private int getFirst(ParsedObject po) {
        return getIntegerNumber(po.getFirstNumber());
    }

    private int getSecond(ParsedObject po) {
        return getIntegerNumber(po.getSecondNumber());
    }

    private Numbers matchTypeOfNumber(String number) {
        Numbers result = null;

        ArabicNumbers<String> arabicNumbers = new ArabicNumbers<>();
        RomanNumbers<String> romanNumbers = new RomanNumbers<>();

        if (arabicNumbers.indexOf(number) != -1) result = Numbers.Arabic;
        if (romanNumbers.indexOf(number) != -1) result = Numbers.Roman;
        return result;
    }
}
