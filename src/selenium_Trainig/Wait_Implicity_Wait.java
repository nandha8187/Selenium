package selenium_Trainig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Implicity_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cricket.com");

		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);          

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.navigate().to("https://www.youtube.in");        
		driver.navigate().back();

		driver.navigate().forward();     

		driver.navigate().refresh();

		driver.close();

	}

}