package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNG {
	public WebDriver driver;
    @BeforeMethod
	public void initialiseBrowser()
	{
		driver = new ChromeDriver();//launching  Chrome browser
		
		driver.get("https://selenium.qabible.in/simple-form-demo.php");//open website with given URL website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait command
		driver.manage().window().maximize();//to maximize the window

	}
    @AfterMethod
	public void browserQuit()
	{
		driver.quit();//browser session terminate//commonly used
		//driver.close();//only specific tab  closes
	}


}
