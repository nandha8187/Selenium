package selenium_Trainig;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink = driver.findElement(By.
				linkText("Download Excel"));

		downloadLink.click();
		
		Thread.sleep(3000);
		
		File filelocation = new File("C:\\Users\\ADMIN\\Downloads");
		
		File[] totalfiles = filelocation.listFiles();
		
		for (File file : totalfiles) {
			
		 if(file.getName().equals("Microsoft Office Excel Worksheet (.xlsx)")) {
			 
			 System.out.println("File is download");
			 break;
		 }
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}