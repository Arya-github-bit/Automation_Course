package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base {

	public void actions()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggablen1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement draggableBox= driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		 actions.moveToElement(draggablen1).build().perform();//to move element
		//actions.doubleClick(draggablen1).perform();//to double click an element
		actions.contextClick(draggablen1).perform();//to rightclick an element
		actions.dragAndDrop(draggablen1, draggableBox).build().perform();//to drag and drop an element
		
	}
	public static void main(String[] args) {
		
		ActionsClass actionsClass = new ActionsClass();
		actionsClass.initialiseBrowser();
		actionsClass.actions();
		actionsClass.browserQuit();
		
	}

}
