package selenium_Trainig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCascading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();














	}

}