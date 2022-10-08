package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert7 {

	public static void main( String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		    
		    WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		    driver.get("http://www.leafground.com/pages/Alert.html");
		    
		    driver.manage().window().maximize();
		   
		    driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.switchTo().alert().accept();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		     
		    Thread.sleep(2000);	
		    
		    driver.switchTo().alert().dismiss();
		    
		    driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		    
		    Thread.sleep(2000);
		    
		    driver.switchTo().alert().sendKeys("14296856");
		    
		    driver.switchTo().alert().accept();
		    
	}		    
		   	
}