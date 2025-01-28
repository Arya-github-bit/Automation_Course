package testscript;

import java.time.Duration;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitFluentWait  extends Base{

	public void explicitwait()
	{
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait object creation wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));//explicit wait code
		showMessageButton.click();

		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement javaScriptConfirmBoxclick = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(3));
		Wait.until(ExpectedConditions.alertIsPresent());
	
		javaScriptConfirmBoxclick.click();

	}
	public void fluentWait()
	{
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));//fluent 
		getTotalButton.click();
	}
	public static void main(String[] args) {
		ExplicitFluentWait explicitFluentWait = new ExplicitFluentWait();
		explicitFluentWait.initialiseBrowser();
		explicitFluentWait.explicitwait();
		//explicitFluentWait.fluentWait();
		explicitFluentWait.browserQuit();

	}

}
