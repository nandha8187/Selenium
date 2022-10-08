 package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollex11{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
		    
		  WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		  driver.get("https://www.amazon.in");
		    
		  driver.manage().window().maximize();
		   
		  JavascriptExecutor js =(JavascriptExecutor)driver;    //narrow type casting  
		
		  WebElement brazi = driver.findElement(By.xpath("//a[text()='Brazil']"));
        
		  js.executeScript("arguments[0].scrollIntoView();", brazi);
		  
		  Thread.sleep(1000);
		  
		 
		  js.executeScript("window.scrollBy(0,-20000);"); 
		  
		  Thread.sleep(1000);
		  
		  js.executeScript("window.scrollBy(0,2000);");
		
		  
		
		
		
		
		
		
		
		
		
		
	}

}