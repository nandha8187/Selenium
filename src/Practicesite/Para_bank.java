package Practicesite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Para_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("https://parabank.parasoft.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));

		reg.click();


		WebElement firstname = driver.findElement(By.id("customer.firstName"));

		firstname.sendKeys("NANDHA");

		WebElement lastname = driver.findElement(By.id("customer.lastName"));

		lastname.sendKeys("KUMAR");

		WebElement add = driver.findElement(By.className("input"));

		add.sendKeys("2/21,PILLAYAR KOVIL STREET");

		WebElement city = driver.findElement(By.name("customer.address.city"));

		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.id("customer.address.state"));

		state.sendKeys("TamilNadu");

		WebElement phno = driver.findElement(By.id("customer.phoneNumber"));

		phno.sendKeys("8148646094");


		WebElement ssn = driver.findElement(By.id("customer.ssn"));

		ssn.sendKeys("1996");


		WebElement username = driver.findElement(By.id("customer.username"));

		username.sendKeys("NANDHA619");

		WebElement pass = driver.findElement(By.id("customer.password"));

		pass.sendKeys("Geetha1426");

		WebElement conformpass = driver.findElement(By.id("repeatedPassword"));

		conformpass.sendKeys("Geetha1426");

		WebElement REGi = driver.findElement(By.xpath("//input[@value='Register']"));

		REGi.click();

















	}

}
