package davlatbek.soft.calculator.workers.static13;

public class Documentator {
    private static final String haveProbelsException =
            "Please, don't have to use probels in a line ->\n\r" +
                    "   $haveProbelsException\n\r";

    private static final String haveTwoNumbersException =
            "Could you enter 2 numbers sharp? ->\n\r" +
                    "   $haveTwoNumbersException\n\r";
    private static final String haveMathOperationException =
            "You must use math operation as +, -, * and / ->\n\r" +
                    "   $haveMathOperationException\n\r";

    private static final String isOnlyOneMathOperationException =
            "Sorry, I can't understand such kind of command" +
                    ", please, we must have only one math operation ->\n\r" +
                    "   $isOnlyOneMathOperationException\n\r";

    private static final String isOnlyOneTypeOfNumbersException =
            "Or I'm going to be stupid or you entered" +
                    " some impossible thing. Use only one type of numbers ->\n\r" +
                    "   $isOnlyOneTypeOfNumbersException\n\r";
    private static final String consistOnlyNeededNumbersException =
            "Please, how time may say, use only NUMBERS " +
                    "from 1 to 10 in arabic or from I to X in roman ->\n\r" +
                    "   $consistOnlyNeededNumsException\n\r";

    private static final String isDoubleException =
            "When we divided, solution wasn't integer, so, sorry ->\n\r" +
                    "   $isDoubleException\n\r";
    private static final String isNegativeException =
            "You know, gmmm, solution is like to negative. As " +
                    "secret: I can't to math negative numbers. Sorry! ->\r\n" +
                    "   $isNegativeException\n\r";

    private static final String divideForZeroException =
            "Sorry, but I must say, are you studied at school?" +
                    " Yes? Can you mind that WE CAN\'T " +
                    "DIVIDE BY ZERO. ->\n\r" +
                    "   $divideForZeroException\n\r";

    private static final String zeroInRomanNumeralException =
            "Answer is zero (0), in Roman numeral" +
                    " it haven't got! ->\n\r" +
                    "   $zeroInRomanNumerical\n\r";

    private static final String nothingEnteredException =
            "Could you enter something, but in broad of our rules! ->\n\r" +
                    "   $nothingEnteredException\n\r";

    private static final String greeting = "" +
            "Hello, my name is PWL13. 'Program which likes number 13'\r\n" +
            "I'm calculator program developed by MDS. Congratulate you started me!!!\r\n\n" +
            "For solve some math exercises enter it(sample: 7+6, X/II).\r\n" +
            "I support arabic(1,2,3...) and roman(I,II,III...) numbers and\r\n" +
            "                      four type of math operations +, -, *, /.\r\n\n" +
            "Enter /about for read something about me,\r\n" +
            "      /rules for get rules of using me!\r\n" +
            "For stop the program enter /stop\r\n" +
            "Enjoy using!!!\r\n";

    private static final String rules = "Rules:\r\n" +
            "1. You must enter 2 numeric math expressions like 9+4 or X-IX.\n\r" +
            "2. I support 2 types of numbers: arabic(1,2,3...) and roman(I,II,III...).\r\n" +
            "3. Why don't use four type of math operations: +, -, *, /. I can to solve this!\r\n" +
            "4. You mustn't use numbers higher then 10(10 is permissed) and zero(0), too.\r\n" +
            "5. It isn't good idea for let probels into expression and write at new line.\r\n" +
            "6. Use only 2 numbers and 1 math operation sharp.\r\n" +
            "7. You know but I'll say. Divide to zero(0) is impossible.\r\n" +
            "\n" +
            "Some notes for 'black day':\r\n" +
            "- In my number 'artillery' I have only positive(+),\r\n" +
            "                      2-10 = -8 but I can't print it!\r\n" +
            "- If answer is double I can't print it.\r\n" +
            "   I'm only for integer type of numbers.\r\n" +
            "- You always can use /rules for print rules and some notes; \r\n" +
            "                     /about for read something about me;\r\n" +
            "                     /greeting for see greeting again.\r\n" +
            "- Write /stop command for stopping this program." +
            "\r\n";

    private static final String about = "" +
            "Name: PWL13. 'Program which likes number 13';\r\n" +
            "Abilities: Calculate 2 numerical math expressions\r\n" +
            "  at 2 type of numbers and 4 type of math operations;\r\n" +
            "Version: 13.13 (1.2 at real);\r\n" +
            "Birthday: 29.11.2019 13:13;\r\n" +
            "Author(Creator): MDS. 'Mirakiov Davlatbek';\r\n" +
            "Author(Idea): JM. 'Java Mentor'.\r\n" +
            "\n" +
            "Write to dmirakilov04@gmail.com for take more information!" +
            "\r\n";

    private static final String stop = "Goodbye!\r\n";

    public static String getHaveProbelsException() {
        return haveProbelsException;
    }

    public static String getHaveTwoNumbersException() {
        return haveTwoNumbersException;
    }

    public static String getHaveMathOperationException() {
        return haveMathOperationException;
    }

    public static String getIsOnlyOneMathOperationException() {
        return isOnlyOneMathOperationException;
    }

    public static String getIsOnlyOneTypeOfNumbersException() {
        return isOnlyOneTypeOfNumbersException;
    }

    public static String getConsistOnlyNeededNumbersException() {
        return consistOnlyNeededNumbersException;
    }

    public static String getIsDoubleException() {
        return isDoubleException;
    }

    public static String getIsNegativeException() {
        return isNegativeException;
    }

    public static String getDivideForZeroException() {
        return divideForZeroException;
    }

    public static String getZeroInRomanNumeralException() {
        return zeroInRomanNumeralException;
    }

    public static String getNothingEnteredException() {
        return nothingEnteredException;
    }

    public static String getGreeting() {
        return greeting;
    }

    public static String getRules() {
        return rules;
    }

    public static String getAbout() {
        return about;
    }

    public static String getStop() {
        return stop;
    }
}
