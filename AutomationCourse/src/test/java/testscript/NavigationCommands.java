package testscript;

public class NavigationCommands extends Base {
	public void navigators()
	{

	}
	public static void main(String[] args) {

		NavigationCommands navigationCommands = new NavigationCommands();
		navigationCommands.initialiseBrowser();
		navigationCommands.navigators();
		navigationCommands.browserQuit();
	}

}
