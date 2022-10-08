package selenium_Trainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
	    
	    driver.get("http://www.leafground.com/pages/frame.html") ;
	    
	    driver.manage().window().maximize();
	
       	//single frame
	    WebElement frame = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	    driver.switchTo().frame(frame);
	    driver.findElement(By.id("click")).click();
	    
	    driver.switchTo().defaultContent();
	    
	    //Multiple frames
	    WebElement inner = driver.findElement(By.xpath("//iframe[@src='page.html']"));
	    driver.switchTo().frame(inner);
	    WebElement inner1 = driver.findElement(By.id("frame2"));
	    driver.switchTo().frame(inner1);
	    driver.findElement(By.id("Click1")).click();
	    driver.switchTo().defaultContent();
	    
	    //total no of frames
	    driver.findElement(By.xpath("//div [@id='wrapframe'][3]"));                   //type 1
	    List<WebElement> framecount = driver.findElements(By.tagName("iframe"));
	    System.out.println("THE TOTAL NO OF FRAMES: "+framecount.size());
		
		
	   List<WebElement>  total = driver.findElements(By.tagName("iframe"));          //type 2 
	   int size = total.size();
	   System.out.println(size);
	
	    
	    
	    
		
		
	}

}