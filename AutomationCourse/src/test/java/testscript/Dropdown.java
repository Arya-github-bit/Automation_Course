package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown  extends Base{

	public void verifyDropdownSelect()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
		List<WebElement> options=select.getOptions();
		int numberofOptions = options.size();

	}
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.selenium.dev");
		WebElement element = driver.findElement(By.xpath("//a[@href='/pt-br/']//ancestor::div[@class='dropdown']"));
		element.click();
		WebElement ulDropdown = driver.findElement(By.xpath("//div[@class='dropdown']//child::a[@class='dropdown-item']"));
		ulDropdown.click();
		List<WebElement> dropDownOptions =  driver.findElements(By.xpath("//div[@class='dropdown']//child::a[@class='dropdown-item']"));

		for(WebElement option:dropDownOptions)
		{
			String language = option.getText();
			if (language.equals("Português (Brasileiro)"))
			{

				option.click();
				break;
			}
		}
	}
	public void verifyMultiElementSelector()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement twoInputField = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select = new Select(twoInputField);
		boolean isDropDownIsMultiSelect =select.isMultiple();//to check whether it is multi select
		select.selectByIndex(1);
		select.selectByIndex(2);
	}
	
	
	public static void main(String[] args) {
		Dropdown dropdown = new Dropdown();
		dropdown.initialiseBrowser();
		dropdown.verifyMultiElementSelector();
		dropdown.verifyDropdown();
		dropdown.browserQuit();

	}

}
