package View;

import Controller.GameController;
import View.view.Menu;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		GameController gameController = new GameController();

		while (true) {
			printMenu(gameController.getCurrentMenu());

			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			gameController.executeAction(userInput);
		}

	}

	public static void printMenu (Menu menu) {
		System.out.println(menu.getTitle() + "\n\n");
		System.out.println(menu.listOptions());
	}

	public static void testMenu () {
		Menu menu = new Menu();
		printMenu(menu);

		menu = new Menu("Tallas de Chichis");
		menu.addOption(new Option("butt", "Flee"));
		menu.addOption(new Option("swing", "Attack"));
		menu.addOption(new Option("nalgas", "Wait"));

		printMenu(menu);
	}

}
