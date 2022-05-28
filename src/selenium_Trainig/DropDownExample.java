package selenium_Trainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic


		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		WebElement dropDown1=driver.findElement(By.id("dropdown1"));

		Select S1 = new Select(dropDown1);

		S1.selectByIndex(4);
		Thread.sleep(3000);

		S1.selectByValue("2");
		Thread.sleep(3000);     

		S1.selectByVisibleText("Selenium");

		List<WebElement> listofOptions = S1.getOptions();
		int size = listofOptions.size();
		System.out.println("Number of elements: "+size);

		dropDown1.sendKeys("Loadrunner");

		WebElement multiSelect=driver.findElement(By.
				xpath("//*[@id='contentblock']/section/div[6]/select"));
		
		Select multiSelectBox= new Select(multiSelect);
		
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		
		
		
		
		
		
		
		
		
		
		








	}

}