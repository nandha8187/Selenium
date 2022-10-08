package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();           	

		driver.get("https://www.fb.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Create')][1]")).click();
		Thread.sleep(2000);

		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("SUNDHARA");

		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("MOORTHI");

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("nandharaina0310@gmail.com");

		WebElement reenter = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reenter.sendKeys("nandharaina0310@gmail.com");

		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("geetha1426");

		WebElement day = driver.findElement(By.id("day"));

		Select s =new Select(day);                  //syntax for selected method

		s.selectByValue("28");                      //1.selectedbyvalue

		WebElement mon = driver.findElement(By.id("month"));

		Select s1 =new Select(mon);

		s1.selectByIndex(4);                        //2.selectedbyindex

		WebElement year = driver.findElement(By.id("year"));

		Select s2 =new Select(year);                //3.selectedbytext

		s2.selectByVisibleText("1996");

		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Up')]")).click();

		boolean b = email.isDisplayed();
		System.out.println("DISPLAYED OR NOT:"+b);

		boolean en = day.isEnabled();
		System.out.println("IS ENABLE OR NOT:" +en);



	}

}