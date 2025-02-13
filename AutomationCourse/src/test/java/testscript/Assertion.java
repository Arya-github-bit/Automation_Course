package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//https://groceryapp.uniqassosiates.com/admin/login
public class Assertion extends BaseTestNG{
	@Test(description = "Verify Background Colour of Showmessage Button")
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
		assertEquals(expectedBackgroundColourofShowmessageButton,actualBackgroundColourofShowmessageButton,"Expected Background Color is  "+ expectedBackgroundColourofShowmessageButton + "But it is " +actualBackgroundColourofShowmessageButton );


	}@Test(description = "verifyWhetherShowMessageButtonisAvailableonHomePage")
	public void verifyWhetherShowMessageButtonisAvailableonHomePage()
	{
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowmessageButtonDisplayed = showMessageButton.isDisplayed();
		assertTrue(isShowmessageButtonDisplayed, "ShowMessage Button is not available");
	}
	@Test(description = "VerifySingleInputField")
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
		assertEquals(expectedYourMessageText, actualYourMessageText,"ExpectedYourMessageText is "+expectedYourMessageText+",But is ActualYourMessageText "+actualYourMessageText); 
	}
	@Test(description = "Verify Whether the User is Able To Select Male Radio Button",priority = 1)
	public void verifyWhethertheUserissAbleToSelectMaleRadioButton()
	{   
		String expectedSuccessMessage = "Radio button 'Male' is checked";
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		WebElement successMessageBox = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualSuccessMessage = successMessageBox.getText();
		assertTrue(isMaleRadioButtonSelected, "Male Radiobutton is not selected");
		boolean flag = false;
		assertFalse(flag,"Expected Message is true ,but it is false");
		int a= 5,b=4;
		assertNotEquals(a, b,"A and B are equal");
		String s= null;
		assertNull(s, "s is not null");
		
		String str ="arya";
		assertNotNull(str,"String is null");

	}
	@Test
	public void softAssert()
	{
		SoftAssert softAssert = new SoftAssert();
		
		boolean flag = true;
		softAssert.assertFalse(flag,"Expected Message is true ,but it is false");
		
		
		int a= 5,b=4;
		softAssert.assertNotEquals(a, b,"A and B are equal");
		
		String s= null;
		softAssert.assertNull(s, "s is not null");
		
		softAssert.assertAll();
	}

}
