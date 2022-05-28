package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking_Dress {

	public static void main(String[] args) throws InterruptedException {
         // TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
			
		WebDriver driver =new ChromeDriver();
		   
		driver.get("http://automationpractice.com/index.php");
			
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("nandharaina0310@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
	   		
	   WebElement gender = driver.findElement(By.xpath("//input[@name='id_gender']"));
	   gender.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}