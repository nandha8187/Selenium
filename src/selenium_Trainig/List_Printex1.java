
package selenium_Trainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Printex1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
		    
	   WebDriver driver =new ChromeDriver();           	
		
       driver.get("https://www.amazon.com/");
		
       driver.manage().window().maximize();
		
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   
	   System.out.println("NO. OF HYPER LINKS: "+links.size());
	
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}