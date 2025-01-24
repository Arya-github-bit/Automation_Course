package testscript;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Popup extends Base{
	public void verifyLikeusonFacebookButton()
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement verifyLikeusonFacebookButton = driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		verifyLikeusonFacebookButton.click();
		String mainWindow= driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();		

			if(!mainWindow.equalsIgnoreCase(ChildWindow))			
			{    		
				driver.switchTo().window(ChildWindow);// Switching to Child window
				WebElement navigatefacebook=driver.findElement(By.xpath("(//span[text()='See more from Obsqura Zone | Kazhakuttam '])[1]"));
			}
		}
driver.close();
driver.switchTo().window(mainWindow);

	}

	public static void main(String[] args) {
		Popup popup = new Popup();
		popup.initialiseBrowser();
		popup.verifyLikeusonFacebookButton();
		popup.browserQuit();
	}
	


}
