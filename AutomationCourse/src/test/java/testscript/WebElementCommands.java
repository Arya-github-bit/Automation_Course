package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void display()

	{
		String expectedBackgroundColour = "rgba(0, 123, 255, 1)";

		WebElement display= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		display.sendKeys("Hello");

		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText = yourMessage.getText();

		//Getting attribute value
		String showMessageType = showMessage.getAttribute("type");
		String showMessageclass = showMessage.getAttribute("class");
		String showMessageId = showMessage.getAttribute("id");
		String yourMessageId = yourMessage.getAttribute("id");


		String backgroundColour = showMessage.getCssValue("background-color");




	}
	public void singleInputField()
	{
		String expectedYourMessageText = "Hello";
		WebElement display= driver.findElement(By.xpath("//input[@id='single-input-field']"));
		display.sendKeys("Hello");

		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		WebElement actualYourMessage =driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualYourMessageText= actualYourMessage.getText();
		if(String.valueOf(expectedYourMessageText).equals(String.valueOf(actualYourMessageText)))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	}
	public void twoInputField()
	{
		String expectedTotal = "60";
		WebElement inputA= driver.findElement(By.xpath("//input[@id='value-a']"));
		inputA.sendKeys("50");
		WebElement inputB= driver.findElement(By.xpath("//input[@id='value-a']"));
		inputB.sendKeys("10");

		WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotal.click();
		WebElement GetTotal =driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualTotal= GetTotal .getText();
		if(String.valueOf(expectedTotal).equals(String.valueOf(actualTotal)))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	}
	public void backgroundColour()
	{
		String expectedBackgroundColour = "rgba(0, 123, 255, 1)";
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBackgroundColour = showMessage.getCssValue("background-color");
		if(String.valueOf(expectedBackgroundColour).equals(String.valueOf(actualBackgroundColour)))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");	
		}


	}
	public void textColour()
	{
		String expectedTextColour = "rgba(255, 255, 255, 1)";
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualTextColour = showMessage.getCssValue("color");
		if(String.valueOf(expectedTextColour).equals(String.valueOf(actualTextColour)))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	}
	public void borderColour()
	{
		String expectedBorderColour = "rgba(0, 123, 255, 1)";
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBorderColour = showMessage.getCssValue("border-color");
		if(String.valueOf(expectedBorderColour).equals(String.valueOf(actualBorderColour)))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	}
	public void font_Weight()
	{
		String expectedfont_Weight = "400";
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualfont_Weight = showMessage.getCssValue("font-weight");
		if(String.valueOf(expectedfont_Weight).equals(String.valueOf(actualfont_Weight)))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	}



	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.singleInputField();
		webelementcommands.twoInputField();
		webelementcommands.display();
		webelementcommands.backgroundColour();
		webelementcommands.textColour();
		webelementcommands.borderColour();
		webelementcommands.font_Weight();
		webelementcommands.browserQuit();
	}

}
