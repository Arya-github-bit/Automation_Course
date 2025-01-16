package testscript;

public class Dropdown  extends Base{
	public void verifyDropdown()
	{
		
	}

	public static void main(String[] args) {
		Dropdown dropdown = new Dropdown();
		dropdown.initialiseBrowser();
		dropdown.verifyDropdown();
		dropdown.browserQuit();

	}

}
