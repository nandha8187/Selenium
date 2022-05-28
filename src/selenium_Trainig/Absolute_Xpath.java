package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		    
		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		driver.get("https://www.amazon.in");
		    
		driver.manage().window().maximize();
			
	    driver.findElement(By.xpath("(/html/body/div/header/div/div[5]/div[2]/div/div/a)[4]")).click(); //absoulute xpath for electronis
	    Thread.sleep(1000);
	    driver.navigate().back();
		
	    }

}