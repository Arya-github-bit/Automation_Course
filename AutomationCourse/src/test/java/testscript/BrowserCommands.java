package testscript;
public class BrowserCommands extends Base {

	public void browserCommands()
	{
		String title = driver.getTitle();// get title of webpage
		String url = driver.getCurrentUrl();// get url of browser
		 String pagesource = driver.getPageSource();//get page source of page source
		 
	}
	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.browserQuit();
	}

}

