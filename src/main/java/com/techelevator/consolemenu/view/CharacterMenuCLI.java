package com.techelevator.consolemenu.view;

import java.util.Scanner;
import com.techelevator.view.Menu;

public class CharacterMenuCLI {
	private static final String MENU_OPTION_FLINT_NOSE = "Flint Nose";
	private static final String MENU_OPTION_HOWLIN_ULFGAR = "Howlin' Ulfgar";
	private static final String MENU_OPTION_STILA_URSTUF = "Stila Urstuf";

	private static final String[] MENU_OPTIONS = 
		{ 
			MENU_OPTION_FLINT_NOSE,
			MENU_OPTION_HOWLIN_ULFGAR,
			MENU_OPTION_STILA_URSTUF
		};

	private final Menu menu;
	private final Scanner keyboardInput = new Scanner(System.in);

	public CharacterMenuCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		boolean finishedCharChoice = false;
		do {
			System.out.println();
			System.out.println("Who do you choose for this adventure? ");

			String subMenuChoice = (String) menu.getChoiceFromOptions(MENU_OPTIONS);

			switch (subMenuChoice) {
				case MENU_OPTION_FLINT_NOSE:
					//TODO show background/traits/etc. of the fighter dwarf Flint Nose.
					//TODO user confirms choice after seeing description.
				break;

				case MENU_OPTION_HOWLIN_ULFGAR:
					//TODO show background/traits/etc. of the bard dwarf Howlin' Ulfgar
					//TODO user confirms choice after seeing description.
				break;

				case MENU_OPTION_STILA_URSTUF:
					//TODO show background/traits/etc. of the rogue Stila Urstuf
					//TODO user confirms choice after seeing description.
				break;
			}

		} while (!finishedCharChoice);
	}

}
