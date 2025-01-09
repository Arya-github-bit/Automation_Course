package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebElementCommands extends Base {
	public void locators()
	{
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		WebElement selectAllButton = driver.findElement(By.id("button-two"));
		WebElement showSelectedValueButton = driver.findElement(By.id("button-two"));
		WebElement classNameSample = driver.findElement(By.className("clearfix"));
		WebElement nameSample = driver.findElement(By.name("viewport"));
		WebElement nameDate = driver.findElement(By.name("daterange"));
		WebElement name1 = driver.findElement(By.name("description"));
		WebElement name2 = driver.findElement(By.name("keywords"));
		WebElement linkTextSample = driver.findElement(By.linkText(" check-box-demo.php"));
		WebElement linkRadio= driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement linkSelectInput = driver.findElement(By.linkText("select-input.php"));
		WebElement linkFormsubmit = driver.findElement(By.linkText("form-submit.php"));
	    WebElement partialLinkText = driver.findElement(By.partialLinkText(" check-box"));
		WebElement partialLinkRadio= driver.findElement(By.partialLinkText("radio-button"));
		WebElement partialLinkSelectInput= driver.findElement(By.partialLinkText("select-input"));
		WebElement partialLinkFormSubmit = driver.findElement(By.partialLinkText("form-submit"));
		WebElement classShowDate= driver.findElement(By.className("btn btn-primary"));
		
	}
	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();

	}

}
