package selenium_Trainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop5 
  {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
		    
	     WebDriver driver =new ChromeDriver();           	
		
		 driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		 driver.manage().window().maximize();
	
         WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
         
         Select s =new Select(multi);
         
         s.selectByValue("1");
		 s.selectByVisibleText("Appium");
		 s.selectByIndex(3);
		
		 s.deselectByValue("3");
		
		 List<WebElement> opt = s.getOptions();
		 for (WebElement option : opt) {
			 System.out.println(option.getText());
			
		}
		
		System.out.println("==============================="); 
		 
		List<WebElement> list = s.getAllSelectedOptions();
		for (WebElement all : list) {
			System.out.println(all.getText());
			
		}
		
		System.out.println("========================");
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
		
		System.out.println("============================="); 
		 
		boolean b = s.isMultiple();
		System.out.println("MULTIPLE OR NOT: " +b);
		
		 
		}
	
	
	
}