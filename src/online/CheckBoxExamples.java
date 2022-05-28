package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement selenium=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));

		boolean seleniumSelected= selenium.isSelected();
		System.out.println(seleniumSelected);
		
		WebElement firstElement=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]"));
		
		if(firstElement.isSelected()) {
		
			firstElement.click();
			
		}
	  WebElement secondElement=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]"));
		
	  if(secondElement.isSelected()){
		  
		  secondElement.click();
		  
		
}
	
	
	
	}

}