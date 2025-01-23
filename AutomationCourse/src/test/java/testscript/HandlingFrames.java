package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	public void handlingFrames()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
		//driver.switchTo().frame(2);
		driver.switchTo().frame("frame");
		//driver.switchTo().frame("a077aa5e");
		WebElement jmeterimg= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeterimg.click();


	}
	public static void main(String[] args) {
		HandlingFrames handlingframes = new HandlingFrames();
		handlingframes.initialiseBrowser();
		handlingframes.handlingFrames();
		handlingframes.browserQuit();

	}

}
