package com.techelevator.consolemenu.view;

import com.techelevator.view.Menu;

public class MainMenuCLI {

	private static final String MAIN_MENU_CHOOSE_YOUR_CHARACTER = "Choose your character";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";

	private static final String[] MAIN_MENU_OPTIONS =
		{ 
			MAIN_MENU_CHOOSE_YOUR_CHARACTER,
			MAIN_MENU_OPTION_EXIT
		};

	private final Menu menu;
	private final CharacterMenuCLI characterMenuCLI;

	public MainMenuCLI(Menu menu, CharacterMenuCLI characterMenuCLI) {
		this.menu = menu;
		this.characterMenuCLI = characterMenuCLI;
	}

	public void run() {
		while (true) {
			System.out.println();
			System.out.println("*************************************************");
			System.out.println("WELCOME TO MEDONIA! A GREAT ADVENTURE AWAITS YOU.");
			System.out.println("*************************************************");
			System.out.println();
			System.out.println("Please make a selection!");
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			switch (choice) {
				case MAIN_MENU_CHOOSE_YOUR_CHARACTER:

				//TODO goto characterMenu
				this.characterMenuCLI.run();
				break;

			case MAIN_MENU_OPTION_EXIT:
				System.out.println("Until next time, adventurer!");
				return;
			}
		}
	}
}
