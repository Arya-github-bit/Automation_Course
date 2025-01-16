package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown  extends Base{
	
	public void verifyDropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		select.selectByIndex(3);
	}

	public static void main(String[] args) {
		Dropdown dropdown = new Dropdown();
		dropdown.initialiseBrowser();
		dropdown.verifyDropdown();
		dropdown.browserQuit();

	}

}
