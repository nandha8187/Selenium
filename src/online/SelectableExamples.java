package online;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> selectable = driver.findElements(By.
				xpath("//*[@id=\'selectable\']/li"));


		int listSize = selectable.size();
		System.out.println(listSize);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
		
//		Actions actions = new Actions(driver);
//		actions.clickAndHold(selectable.get(0));
//		actions.clickAndHold(selectable.get(1));
//		actions.clickAndHold(selectable.get(2));
//		actions.build().perform();
//		
//		
		
		
		
	}

}