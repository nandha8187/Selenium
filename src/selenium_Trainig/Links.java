package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		driver.get("https://www.google.in");
		    
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Home Page")).click();
		
		
		
		
		
		
		
		
		
	}

}