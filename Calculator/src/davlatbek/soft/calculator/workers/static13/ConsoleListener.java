package davlatbek.soft.calculator.workers.static13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleListener {
    private BufferedReader consoleRead;

    public static ConsoleListener getInstance() {
        return new ConsoleListener();
    }

    public ConsoleListener() {
        consoleRead = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getLine() throws IOException {
        return consoleRead.readLine();
    }
}