package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.click();
	}
	public void fileUploadUsingRobotClass()
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement chooseFile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		chooseFile.click();
		
	}

	public static void main(String[] args) {
		FileUpload fileUpload = new FileUpload();
		fileUpload.initialiseBrowser();
		//fileUpload.fileUploadUsingSendKeys();
		fileUpload.fileUploadUsingRobotClass();
		fileUpload.browserQuit();

	}

}
