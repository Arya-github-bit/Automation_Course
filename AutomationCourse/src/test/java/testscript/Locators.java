package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Locators extends Base {
	public void locators()
	{
		
		
		WebElement xpathfollowingSibling= driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		WebElement xpathdescendant= driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='container page']"));
		WebElement xpathancestor= driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));//ancestor
		WebElement xpathpreceeding= driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));//preceeding
		WebElement xpathfollowing= driver.findElement(By.xpath("//button[@id='button-one']//following::div[id='message-one']"));//followng method
		WebElement xpathChild= driver.findElement(By.xpath("//section[@class='clearfix']//child::div[@class='container'"));//child technique
		WebElement xpathParent= driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));//parent technique show message button
		
		WebElement xpathSample4= driver.findElement(By.xpath("//button[@id='button-one']"));//Xpath
		WebElement xpathClass= driver.findElement(By.xpath("//div[@class='card-header']"));
		WebElement xpathDiv = driver.findElement(By.xpath("//div[@class='card-header']"));
		WebElement xpathInput = driver.findElement(By.xpath("//input[@class='form-control']"));
		WebElement xpathInput1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement xpathId = driver.findElement(By.xpath("//a[@id='others']"));

		WebElement xpathContains = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));//contains Xpath initial part
		WebElement xpathContains1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement xpathContains2 = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement xpathContains3 = driver.findElement(By.xpath("//input[starts-with@id,'value-a')]"));
		WebElement xpathContainsEnd = driver.findElement(By.xpath("//button[contains(@id,'-one')]"));//contains Xpath end part
		WebElement xpathStartswith = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));//conatains Starting part
		WebElement xpathText = driver.findElement(By.xpath("//button[text()='Show Message']"));//Xpath with text 
		WebElement xpathText1 = driver.findElement(By.xpath("//button[text ()='Get Total']"));
		WebElement xpathAnd = driver.findElement(By.xpath("//button[text()='Show Message'and@id=\"button-one\"]"));//Xpath And

		WebElement xpathOr = driver.findElement(By.xpath("//button[text()='Show Message'or @id=\"button-one\"]"));//Xpath Or

		WebElement cssTagName= driver.findElement(By.tagName("div"));//add tag name
		WebElement cssInput = driver.findElement(By.tagName("div"));
		WebElement cssshowButton = driver.findElement(By.tagName("button"));
		WebElement cssLink = driver.findElement(By.tagName("a"));

		WebElement cssAtribute= driver.findElement(By.cssSelector("Link[href='css/main.css']"));//css selecter with atribute
		WebElement cssAtribute1= driver.findElement(By.cssSelector("a[href='bootstrap-dual-list.php']"));
		WebElement cssAtribute2= driver.findElement(By.cssSelector("a[href='drag-drop.php']"));
		WebElement cssAtribute3= driver.findElement(By.cssSelector("a[href='bootstrap-alert.php']"));

		WebElement cssClassName= driver.findElement(By.cssSelector("section.clearfix"));//css with class name
		WebElement cssClassDiv= driver.findElement(By.cssSelector("div.row"));

		WebElement cssId= driver.findElement(By.cssSelector("button#button-one"));//css with id

		WebElement cssWithTag= driver.findElement(By.cssSelector(".clearfix"));
		WebElement cssWithTag1= driver.findElement(By.cssSelector(".nav-link"));
		WebElement cssWithTag2= driver.findElement(By.cssSelector(".list-group-item"));
		WebElement cssWithTag3= driver.findElement(By.cssSelector(".card"));
		//Css selector ************************************************************************************************************

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

		WebElement linkTextSample = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement linkRadio= driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linkSelectInput = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement linkFormsubmit = driver.findElement(By.linkText("Select Input"));

		WebElement partialLinkText = driver.findElement(By.partialLinkText("Form Demo"));
		WebElement partialLinkRadio= driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partialLinkSelectInput= driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement partialLinkFormSubmit = driver.findElement(By.partialLinkText("Select Input"));
		WebElement classShowDate= driver.findElement(By.className("btn btn-primary"));

	}
	public static void main(String[] args) {
		Locators webelementcommands = new Locators();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();

	}

}
