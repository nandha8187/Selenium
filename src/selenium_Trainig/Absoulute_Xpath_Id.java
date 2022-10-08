package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absoulute_Xpath_Id {


		public static void main(String[] args) throws InterruptedException {
	    // TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
			    
	    WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
			    
		driver.get("https://www.amazon.in");
			    
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//div[@id='navbar']/div[5]/div[2]/div/div/a[1]")).click(); //absolute xpath using id method
		
		driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}