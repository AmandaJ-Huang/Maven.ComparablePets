package io.zipcoder;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private PrintStream output;
    private Scanner input;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Integer integerInput = Integer.parseInt(stringInput);
            return integerInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
            return getIntegerInput(prompt, args);
        }
    }
}
