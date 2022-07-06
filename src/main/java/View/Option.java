package View;

public class Option {

    private final String NEW_GAME = "New Game";
    private final String EXIT_GAME = "Exit Game";
    private String text;
    private String action;

    public Option (String text, String action) {
        this.text = text;
        this.action = action;
    }

    public String getText() {
        return text;
    }

    public String getAction() {
        return action;
    }
}
