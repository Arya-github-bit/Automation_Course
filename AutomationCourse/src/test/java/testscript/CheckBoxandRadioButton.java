package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxandRadioButton extends Base{
	public void verifyCheckBox()
	{ 
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement checkBox= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		boolean ischeckboxSelected = checkBox.isSelected();
	}
	
	public void verifyWhethertheUserissAbleToSelectMaleOption()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isMaleButtonisSelected = maleRadioButton.isSelected();
		boolean isFemaleButtonisSelcted = femaleRadioButton.isSelected();
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		WebElement successMessageBox = driver.findElement(By.xpath("//div[@id='message-one']"));
		String successMessage = successMessageBox.getText();
		
		
	}
	public static void main(String[] args) {

		CheckBoxandRadioButton checkBoxandRadioButton = new CheckBoxandRadioButton();
		checkBoxandRadioButton.initialiseBrowser();
		//checkBoxandRadioButton.verifyCheckBox();
		checkBoxandRadioButton.verifyWhethertheUserissAbleToSelectMaleOption();
		checkBoxandRadioButton.browserQuit();

	}
}
