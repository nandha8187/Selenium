package selenium_Trainig;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screeshot4     {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions ch = new ChromeOptions();


		ch.addArguments("Incognito");         

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");


		WebDriver driver= new ChromeDriver(ch);

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("nandharaina0310@gmail.com");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("geetha1426");

		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);

		TakesScreenshot ts =(TakesScreenshot)driver;   //narrowing type casting

		File source = ts.getScreenshotAs(OutputType.FILE); //RETURN TYPE

		File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\image01.png");

		FileHandler.copy(source, destination);
		
	










	}

}