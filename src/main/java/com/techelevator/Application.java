package com.techelevator;

import com.techelevator.consolemenu.view.CharacterMenuCLI;
import com.techelevator.consolemenu.view.MainMenuCLI;
import com.techelevator.view.Menu;

public class Application {

	public static void main(String[] args) {

		// Create CLIs
		Menu menu = new Menu(System.in, System.out);
		CharacterMenuCLI characterMenuCLI = new CharacterMenuCLI(menu);
		MainMenuCLI cli = new MainMenuCLI(menu, characterMenuCLI);

		// Begin
		cli.run();
	}

}
