package testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//th[text()='Name'or text()='Position' or text()='Office' or text()='Age' or text()='Start date ' or text() = 'Salary'
public class Table extends Base {
	public void verifySearchAshtonCox()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> nameElement= driver.findElements(By.xpath("//tr[@class='odd' or @ class='even']//child::td[text ()='Tiger Nixon' or text ()='Garrett Winters' or text()='Ashton Cox' or text ()='Cedric Kelly'or text()='Airi Satou' or text()= 'Brielle Williamson' or text ()='Herrod Chandler'or text() ='Rhona Davidson' or text ()='Colleen Hurst' or text()='Sonya Frost']"));
		for(WebElement option : nameElement)
		{
			String name = option.getText();
			if(name.equals("Ashton Cox"))
			{
				System.out.println(name+" is present in table");
				break;
			}

		}
	}
	public void verifySearchCedricKelly()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<String>expectedTableHeader =new ArrayList<String>(List.of("Name", "Position", "Office", "Age", "Start Date"));
		List<WebElement>nameElement=driver.findElements(By.xpath("//tr[@class='odd' or @ class='even']//child::td[text ()='Tiger Nixon' or text ()='Garrett Winters' or text()='Ashton Cox' or text ()='Cedric Kelly'or text()='Airi Satou' or text()= 'Brielle Williamson' or text ()='Herrod Chandler'or text() ='Rhona Davidson' or text ()='Colleen Hurst' or text()='Sonya Frost']"));
		for(WebElement option :nameElement) {
			String name=option.getText();
			if(name.equals("Cedric Kelly"))
			{
				System.out.println(name+" is present in the table");
			}
		}
	}
	public void verifyHeaderofTheTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<String>expectedTableHeader=new ArrayList<>(List.of("Name", "Position", "Office", "Age", "Start date","Salary"));
		List<String>actualTableHeader = new ArrayList<String>();
		List<WebElement>tableHeaderRow =  driver.findElements(By.xpath("//tr[@role='row']//th"));
		for(WebElement tableHeader : tableHeaderRow)
		{
			actualTableHeader.add(tableHeader.getText());
		}
		if(expectedTableHeader.equals(actualTableHeader))
		{
			System.out.println("Table Header verification Passed");
		}
		else
		{
			System.out.println("Table Header verification Failed");
		}
	}
	public static void main(String[] args) {

		Table table= new Table();
		table.initialiseBrowser();
		//table.verifySearchAshtonCox();
		//table.verifySearchCedricKelly();
		table.verifyHeaderofTheTable();
		table.browserQuit();
	}

}
