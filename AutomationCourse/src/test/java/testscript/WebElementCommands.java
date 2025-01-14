package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void display()

	{


		WebElement display= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		display.sendKeys("Hello");
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));

		showMessage.click();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.display();
		webelementcommands.browserQuit();
	}

}
