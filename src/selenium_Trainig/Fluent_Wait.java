	package selenium_Trainig;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.xpath("//input[@autocapitalize='none']"));
		user.sendKeys("wwe");
		Thread.sleep(2000);

		WebElement cck = driver.findElement(By.xpath("//button[contains(@id,'search-icon-legacy')]"));
		cck.click();
		Thread.sleep(2000);

		driver.navigate().to("https://www.cricket.com./");
		Thread.sleep(2000);

		WebElement nandha =driver.findElement(By.xpath("//div[contains(text(),'Fantasy')]"));
		nandha.click();
		Thread.sleep(2000);

		driver.navigate().back();


		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchContextException.class);


		WebElement live =wait1.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//div[text()='Schedule']"));
			}
		});

		live.click();

    
		driver.close();

	}

}