package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Popup extends Base{
	public void verifyLikeusonFacebookButton()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement verifyLikeusonFacebookButton = driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		Actions action = new Actions(driver);
		action.doubleClick(verifyLikeusonFacebookButton).perform();
		
	}

	public static void main(String[] args) {
		Popup popup = new Popup();
		popup.initialiseBrowser();
		popup.verifyLikeusonFacebookButton();
		popup.browserQuit();
	}

}
