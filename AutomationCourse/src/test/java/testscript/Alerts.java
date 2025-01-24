package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alerts extends Base {
public void verifyJavaScriptalertBoxClick()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
WebElement javaScriptalertBoxClick = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
javaScriptalertBoxClick.click();
String alertText= driver.switchTo().alert().getText();
driver.switchTo().alert().accept();
	
}
public void verifyjavaScriptConfirmBoxclick()
{ driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement javaScriptConfirmBoxclick = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	javaScriptConfirmBoxclick.click();
	driver.switchTo().alert().dismiss();
}
public void verifyAlertBoxclick()
{driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement alertBoxclick = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	alertBoxclick.click();
	driver.switchTo().alert().sendKeys("Arya");
	driver.switchTo().alert().accept();
}
	public static void main(String[] args) {
		Alerts alerts = new Alerts();
		alerts.initialiseBrowser();
		alerts.verifyJavaScriptalertBoxClick();
		//alerts.verifyjavaScriptConfirmBoxclick();
		//alerts.verifyAlertBoxclick();
		alerts.browserQuit();

	}

}
