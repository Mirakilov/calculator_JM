package davlatbek.soft.calculator;

import davlatbek.soft.calculator.models.ConvertedObject;
import davlatbek.soft.calculator.models.exceptions.ProjectExceptions;
import davlatbek.soft.calculator.models.ParsedObject;
import davlatbek.soft.calculator.models.SolvedObject;
import davlatbek.soft.calculator.workers.simple.Converter;
import davlatbek.soft.calculator.workers.simple.Parser;
import davlatbek.soft.calculator.workers.simple.Solver;
import davlatbek.soft.calculator.workers.static13.ConsoleListener;
import davlatbek.soft.calculator.workers.static13.Documentator;

import java.io.IOException;

/**
 * @JDK -ver 1.8 build 191
 * @author MDS!
 * @version 1.2
 */

public class Main {
    public static void main(String[] args) throws IOException {
        //Workers
        ConsoleListener consoleListener = ConsoleListener.getInstance();
        Converter converter = Converter.getInstance();
        Parser parser = Parser.getInstance();
        Solver solver = Solver.getInstance();

        //Models
        ParsedObject parsedObject;
        ConvertedObject convertedObject;
        SolvedObject solvedObject;

        String newLine = "";
        printDoc("/greeting");

        do {
            try {
                newLine = consoleListener.getLine();
                if (checkingForDoc(newLine)) {
                    printDoc(newLine);
                    continue;
                }
                parsedObject = parser.parse(newLine);
                convertedObject = converter.convert(parsedObject);
                solvedObject = solver.solve(convertedObject);

                print(solvedObject.getNumberForShowing() + "\n\r");
            } catch (ProjectExceptions e) {
                if (!newLine.equals("/stop")) e.print();
            }
        }
        while (!newLine.equals("/stop"));
    }

    private static boolean checkingForDoc(String lineForCheck) {
        boolean result = false;
        if (lineForCheck.equals("/rules") ||
                lineForCheck.equals("/about") ||
                lineForCheck.equals("/greeting")) result = true;
        return result;
    }

    private static void printDoc(String lineForPrint) {
        String result = Documentator.getGreeting();
        if (lineForPrint.equals("/rules")) {
            result = Documentator.getRules();
        }
        if (lineForPrint.equals("/about")) {
            result = Documentator.getAbout();
        }
        if (lineForPrint.equals("/greeting")) {
            result = Documentator.getGreeting();
        }
        if (lineForPrint.equals("/stop")) {
            result = Documentator.getStop();
        }
        print(result);
    }

    private static void print(String lineForPrint){
        System.out.println(lineForPrint);
    }

}
