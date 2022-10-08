package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().fullscreen();

		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement name = driver.findElement(By.id("age"));
		
		String toolTipText = name.getAttribute("title");
		System.out.println(toolTipText);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}