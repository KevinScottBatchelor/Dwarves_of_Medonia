package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

	private final PrintWriter display;
	private final Scanner input;

	public Menu(InputStream input, OutputStream output) {
		this.input = new Scanner(input);
		this.display = new PrintWriter(output);
	}

	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
	}

	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = input.nextLine();
		try {
			int selectedOption = Integer.parseInt(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			display.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	}

	private void displayMenuOptions(Object[] options) {
		display.println();
		for (int i = 0; i < options.length; i++) {
			int optionNum = i + 1;
			display.println(optionNum + ") " + options[i]);
		}
		display.print(System.lineSeparator() + "What do you do? >>> ");
		display.flush();
	}
}
