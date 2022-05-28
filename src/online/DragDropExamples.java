package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExamples {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement 	From = driver.findElement(By.id("draggable"));
		
		WebElement To = driver.findElement(By.id("droppable"));
		
		Actions  actions = new Actions(driver);
		
		//actions.clickAndHold(From).moveToElement(To).release().build().perform();
		
		actions.dragAndDrop(From, To).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}