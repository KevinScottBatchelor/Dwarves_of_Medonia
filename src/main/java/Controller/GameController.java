package Controller;

import View.Option;
import View.view.Menu;

public class GameController {

    private final String NEW_GAME = "New Game";
    private final String EXIT_GAME = "Exit Game";
    private final String FLEE = "Flee";
    private final String NO = "No";
    private final String YES = "Yes";
    private Menu mainMenu = new Menu("Main Menu");
    private Menu newGameMenu = new Menu("Choose a character");
    private Menu currentMenu;

    public GameController () {
        mainMenu.addOption(new Option("New Game", "New Game"));
        mainMenu.addOption(new Option("Load Game", "Load Game"));
        mainMenu.addOption(new Option("Exit Game", "Exit"));
        currentMenu = mainMenu;

        newGameMenu.addOption(new Option("Dwarf1", ""));
        newGameMenu.addOption(new Option("Dwarf2", ""));
        newGameMenu.addOption(new Option("Dwarf3", ""));
    }

    public Menu getCurrentMenu() {
        return currentMenu;
    }

    public void executeAction(String menuChoice) {
        int menuChoiceInt = Integer.parseInt(menuChoice) - 1;
        Option playerChoice = currentMenu.getOption(menuChoiceInt);
        switch (playerChoice.getAction()) {
            case NEW_GAME:
                newGame();
                break;
            case EXIT_GAME:
                exitGame();
                break;
        }
    }

    public void newGame() {
        currentMenu = newGameMenu;
    }

    public void exitGame() {
        System.exit(69);
    }
}