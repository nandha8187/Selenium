package online;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropDown1);
		
		select.selectByIndex(3);
		select.selectByValue("2");
		select.selectByVisibleText("Selenium");


		List<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of elements: "+size);
		
		dropDown1.sendKeys("Loadrunner");
		
	   WebElement	multiSelect=driver.findElement(By.
			   xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		

	   Select multiSelectBox = new Select(multiSelect);
	   
	   multiSelectBox.selectByIndex(1);
	   multiSelectBox.selectByIndex(2);
	   multiSelectBox.selectByIndex(3);
	   
	   




	}

}