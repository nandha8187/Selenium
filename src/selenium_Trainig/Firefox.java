package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Firefox {

	public static void main(String[] args) {
       // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		driver.get("https://www.google.in");
		    
		driver.manage().window().maximize();
		
		//enter a search term
		//click the  Wikipedia link
		
		
		driver.findElement(By.name("q")).sendKeys("trichy"+Keys.ENTER);
		
		
       //driver.quit();
		
		
	
		
		
		
		
	}

}