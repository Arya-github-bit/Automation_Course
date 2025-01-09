package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebElementCommands extends Base {
	public void locators()
	{
		WebElement xpathSample= driver.findElement(By.xpath("//button[@id='button-one']"));//Xpath
		WebElement xpathClass= driver.findElement(By.xpath("//div[@class='card-header']"));
		WebElement xpathDiv = driver.findElement(By.xpath("//div[@class='card-header']"));
		WebElement xpathInput = driver.findElement(By.xpath("//input[@class='form-control']"));
		WebElement xpathInput1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement xpathId = driver.findElement(By.xpath("//a[@id='others']"));
		
		WebElement cssTagName= driver.findElement(By.tagName("div"));//add tag name
		WebElement cssInput = driver.findElement(By.tagName("div"));
		WebElement cssshowButton = driver.findElement(By.tagName("button"));
		WebElement cssLink = driver.findElement(By.tagName("a"));
		
		WebElement cssAtribute= driver.findElement(By.cssSelector("Link[href='css/main.css']"));//css selecter with atribute
		WebElement cssAtribute1= driver.findElement(By.cssSelector("a[href='bootstrap-dual-list.php']"));
		WebElement cssAtribute2= driver.findElement(By.cssSelector("a[href='drag-drop.php']"));
		WebElement cssAtribute3= driver.findElement(By.cssSelector("a[href='bootstrap-alert.php']"));
		
		WebElement cssClassName= driver.findElement(By.cssSelector("section.clearfix"));//css with class name
		
		WebElement cssId= driver.findElement(By.cssSelector("button#button-one"));//css with id
		
		WebElement cssWithTag= driver.findElement(By.cssSelector(".clearfix"));
		WebElement cssWithTag1= driver.findElement(By.cssSelector(".nav-link"));
		WebElement cssWithTag2= driver.findElement(By.cssSelector(".list-group-item"));
	    WebElement cssWithTag3= driver.findElement(By.cssSelector(".card"));
		
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement getTotalButton = driver.findElement(By.id("button-two"));
		WebElement selectAllButton = driver.findElement(By.id("button-two"));
		WebElement showSelectedValueButton = driver.findElement(By.id("button-two"));
		
		WebElement classNameSample = driver.findElement(By.className("clearfix"));
		WebElement classContain = driver.findElement(By.className("mb-sec"));
		WebElement classRow= driver.findElement(By.className("row"));
		WebElement classBar= driver.findElement(By.className("navbar-nav"));
		
		
		WebElement nameSample = driver.findElement(By.name("viewport"));
		WebElement name1 = driver.findElement(By.name("description"));
		WebElement name2 = driver.findElement(By.name("keywords"));
		WebElement name3 = driver.findElement(By.name("author"));
		
		WebElement linkTextSample = driver.findElement(By.linkText("check-box-demo.php"));
		WebElement linkRadio= driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement linkSelectInput = driver.findElement(By.linkText("select-input.php"));
		WebElement linkFormsubmit = driver.findElement(By.linkText("form-submit.php"));
		
	    WebElement partialLinkText = driver.findElement(By.partialLinkText("check-box"));
		WebElement partialLinkRadio= driver.findElement(By.partialLinkText("radio-button"));
		WebElement partialLinkSelectInput= driver.findElement(By.partialLinkText("select-input"));
		WebElement partialLinkFormSubmit = driver.findElement(By.partialLinkText("form-submit"));
		WebElement classShowDate= driver.findElement(By.className("btn btn-primary"));
		
	}
	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();

	}

}
