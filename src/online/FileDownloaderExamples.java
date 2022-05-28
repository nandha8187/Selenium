package online;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloaderExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/download.html");

		WebElement dowloadLink = driver.findElement(By.linkText("Download Excel"));

		dowloadLink.click();

		Thread.sleep(3000);
		
		//C:\Users\ADMIN\Downloads


		File fileLocation = new File("C:\\Users\\ADMIN\\Downloads");


		File[] totalFiles=fileLocation.listFiles();
		
		for (File file : totalFiles) {
			
			if(file.getName().equals("Microsoft Office Excel")) {
				System.out.println("File is download");
				break;
			}
					
			
		}
		











	}

}