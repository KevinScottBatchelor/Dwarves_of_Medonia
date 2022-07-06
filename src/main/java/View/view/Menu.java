package View.view;

import View.Option;
import java.util.ArrayList;
import static java.lang.String.valueOf;


public class Menu {

	private String title;
	private ArrayList<Option> options = new ArrayList();

	public Menu (String title) {
		this.title = title;
	}

	public Menu () {
		this.title = "Test";
		options.add(new Option("yes", "yes"));
		options.add(new Option("no", "no"));
	}

	public void addOption (Option option) {
		options.add(option);
	}

	public Option getOption (int index) {
		return options.get(index);
	}

	public String getTitle() {
		return title;
	}

	public String listOptions () {
		String output = "";
		int girth = options.size();

		for(int i = 0; i < girth; i++) {
			output += valueOf(i+1) + ". " + options.get(i).getText() + "\n";
		}

		return output;
	}

}