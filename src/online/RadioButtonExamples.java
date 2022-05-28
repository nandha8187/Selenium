package online;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/radio.html");

		WebElement Unchecked=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		
		WebElement Checked=driver.findElement(By.
				xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		
		Unchecked.isSelected();
		
		boolean status1 = Unchecked.isSelected();
		boolean status2 = Checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
		
		









	}

}