package online;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		
		input.sendKeys("s");
		
		Thread.sleep(4000);  // Explicit wait implicit wait
	
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		System.out.println(optionsList.size());
		
		for (WebElement webElement : optionsList) {
			
			if (webElement.getText().equals("Web Services")){
				
				webElement.click();
				
				System.out.println("Selecting "+webElement.getText());
				
				break;
				
				
				
			}
			
	
		}
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}