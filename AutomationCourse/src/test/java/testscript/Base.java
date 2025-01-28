package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
 public WebDriver driver;

	public void initialiseBrowser()
	{
		driver = new ChromeDriver();//launching  Chrome browser
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");//open website with given URL website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait command
		driver.manage().window().maximize();//to maximize the window

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