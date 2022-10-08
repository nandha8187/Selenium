package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
	    
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    
	    driver.manage().window().maximize();
	   		
	    WebElement alert = driver.findElement(By.xpath("//button[contains(text(),'alert box:')]"));   
	    alert.click();
	    driver.switchTo().alert().accept();
	    System.out.println(alert.getText());
	    System.out.println("----------------------------------------------");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		WebElement confirm = driver.findElement(By.xpath("//button[contains(text(),'confirm box')]"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		System.out.println(confirm.getText());
		
		System.out.println("------------------------------------------------");
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		WebElement prompt = driver.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
		prompt.click();
		driver.switchTo().alert().sendKeys("nandha");
		driver.switchTo().alert().accept();
		System.out.println(prompt.getText());
		
		driver.quit();
		}

}