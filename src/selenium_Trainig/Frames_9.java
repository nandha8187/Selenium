package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
	    
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    
	    driver.manage().window().maximize();
	  
		driver.switchTo().frame("singleframe");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("NANDHA");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement outter = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outter);
		
	    WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    
	    driver.switchTo().frame(inner);
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12535665");
	    
	    driver.switchTo().parentFrame();
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//a[text()='Video']")).click();
	    
	    driver.quit();
		
		
		
		
	}

}