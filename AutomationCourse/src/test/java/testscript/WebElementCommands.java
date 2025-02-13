package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {


	public void display()

	{
		WebElement display= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		display.sendKeys("Hello");
		// display.clear();//to clear a text field
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isshowMessageButtonenabled =showMessage.isEnabled();
		showMessage.isDisplayed();
		showMessage.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText = yourMessage.getText();

		//Getting attribute value
		String showMessageType = showMessage.getAttribute("type");
		String tagname=showMessage.getTagName();
		String showMessageclass = showMessage.getAttribute("class");
		String showMessageId = showMessage.getAttribute("id");
		String yourMessageId = yourMessage.getAttribute("id");
	}
	public void VerifySingleInputField()
	{
		String expectedYourMessageText = "Arya";
		WebElement singleInputField= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(expectedYourMessageText);

		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait object creation wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));//explicit wait code
		showMessageButton.click();

		WebElement yourMessageTextBox =driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText= yourMessageTextBox.getText();
		String actualYourMessageText = yourMessageText.substring(15);
		if(expectedYourMessageText.equals(actualYourMessageText))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}
	}
	public void verifyTwoInputField()
	{   int a= 200;
	int b = 300;
	int expectedTotal = a+b;
	WebElement inputATextbox= driver.findElement(By.xpath("//input[@id='value-a']"));
	inputATextbox.sendKeys(""+a);
	WebElement inputBTextbox= driver.findElement(By.xpath("//input[@id='value-b']"));
	inputBTextbox.sendKeys(""+b);
	WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));//fluent 
	getTotalButton.click();
	WebElement totalText =driver.findElement(By.xpath("//div[@id='message-two']"));
	String total =totalText.getText();
	int actualTotal = Integer.parseInt(total.substring(14));
	if(expectedTotal==actualTotal)
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");	
	}
	}


	public void verifyBackgroundColourofShowmessageButton()
	{
		String expectedBackgroundColourofShowmessageButton = "rgba(0, 123, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBackgroundColourofShowmessageButton = showMessageButton.getCssValue("background-color");
		if(expectedBackgroundColourofShowmessageButton.equals(actualBackgroundColourofShowmessageButton))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}


	}

	public void VerifyTextColourofShowmessageButton()
	{
		String expectedTextColourofShowmessageButton = "rgba(255, 255, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualTextColourofShowmessageButton  = showMessageButton.getCssValue("color");
		if(expectedTextColourofShowmessageButton .equals(actualTextColourofShowmessageButton ))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}
	}
	public void VerifyBorderColourofShowMessageButton()
	{
		String expectedBorderColourofShowMessageButton = "rgb(0, 123, 255)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBorderColourofShowMessageButton = showMessageButton.getCssValue("border-color");
		if(expectedBorderColourofShowMessageButton.equals(actualBorderColourofShowMessageButton))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}
	}
	public void verifyFont_WeightofShowmessageButton()
	{
		String expectedFont_WeightofShowmessageButton = "400";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualFont_WeightofShowmessageButton = showMessageButton.getCssValue("font-weight");
		if(expectedFont_WeightofShowmessageButton.equals(actualFont_WeightofShowmessageButton))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}
	}




	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.VerifySingleInputField();
		//webelementcommands.verifyTwoInputField();
		//webelementcommands.display();
		//webelementcommands.verifyBackgroundColourofShowmessageButton();
		//webelementcommands.VerifyTextColourofShowmessageButton();
		//webelementcommands.VerifyBorderColourofShowMessageButton();
		//webelementcommands.verifyFont_WeightofShowmessageButton();
		webelementcommands.browserQuit();
	}

}
