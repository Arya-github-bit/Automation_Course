package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
 public WebDriver driver;

	public void initialiseBrowser()
	{
		driver = new ChromeDriver();//launching  Chrome browser
		driver.get("https://selenium.qabible.in/simple-form-demo.php");//open amazon website
		driver.manage().window().maximize();//to maximize window

	}
	public void browserQuit()
	{
		driver.quit();//browser session terminate//commonly used
		//driver.close();//only specific tab  closes
	}


	public static void main(String[] args) {
		Base base = new Base();
		base.initialiseBrowser();
		base.browserQuit();

	}


}