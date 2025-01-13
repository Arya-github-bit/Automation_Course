package testscript;

public class NavigationCommands extends Base {
	public void navigators()
	{
		driver.navigate().to("https://www.amazon.in");//navigate to amazon web page
        driver.navigate().back();//navigate back to obsqura homepage
        driver.navigate().forward();//navigate to amazon web page
        driver.navigate().refresh();//refresh page
	}
	public static void main(String[] args) {

		NavigationCommands navigationCommands = new NavigationCommands();
		navigationCommands.initialiseBrowser();
		navigationCommands.navigators();
		navigationCommands.browserQuit();
	}

}
