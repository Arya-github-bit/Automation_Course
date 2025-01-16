package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxandRadioButton extends Base{
	public void verifyCheckBox()
	{ 
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		boolean ischeckboxSelected = checkBox.isSelected();
	}
	
	public void verifyWhethertheUserissAbleToSelectMaleOption()
	{   
		String expectedSuccessMessage = "Radio button 'Male' is checked";
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isMaleButtonisSelected = maleRadioButton.isSelected();
		boolean isFemaleButtonisSelcted = femaleRadioButton.isSelected();
		if(femaleRadioButton.isSelected()==false&&maleRadioButton.isSelected()==false)
		{
			System.out.println("Initially RadioButtons are disabled");
		}
		else
		{
			System.out.println("Initially RadioButtons are enabled,unexpected error");
		}
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		if(maleRadioButton.isSelected()==true)
		{
			System.out.println("MaleRadioButton is selected");
		}
		else
		{
			System.out.println("MaleRadioButton is not selected,unexpected error");
		}
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		WebElement successMessageBox = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualSuccessMessage = successMessageBox.getText();
		if(expectedSuccessMessage.equals(actualSuccessMessage))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
	}
	public static void main(String[] args) {

		CheckBoxandRadioButton checkBoxandRadioButton = new CheckBoxandRadioButton();
		checkBoxandRadioButton.initialiseBrowser();
		checkBoxandRadioButton.verifyCheckBox();
		checkBoxandRadioButton.verifyWhethertheUserissAbleToSelectMaleOption();
		checkBoxandRadioButton.browserQuit();

	}
}
