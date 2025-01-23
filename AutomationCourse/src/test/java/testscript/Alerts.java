package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alerts extends Base {
public void verifyJavaScriptalertBoxClick()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
WebElement javaScriptalertBoxClick = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
Actions action = new Actions(driver);
action.doubleClick( javaScriptalertBoxClick).perform();
	
}
public void verifyjavaScriptConfirmBoxclick()
{
	WebElement javaScriptConfirmBoxclick = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	Actions action1 = new Actions(driver);
	action1.doubleClick(javaScriptConfirmBoxclick).perform();
}
public void verifyAlertBoxclick()
{
	WebElement alertBoxclick = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	Actions action3 = new Actions(driver);
	action3.doubleClick(alertBoxclick).perform();	
}
	public static void main(String[] args) {
		Alerts alerts = new Alerts();
		alerts.initialiseBrowser();
		alerts.verifyJavaScriptalertBoxClick();
		alerts.verifyjavaScriptConfirmBoxclick();
		alerts.verifyAlertBoxclick();
		alerts.browserQuit();

	}

}
