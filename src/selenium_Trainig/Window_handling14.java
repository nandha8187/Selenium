package selenium_Trainig;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling14 {

		public static void main(String[] args) throws AWTException, InterruptedException {
	          // TODO Auto-generated method stub

			 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
			    
			 WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
			    
			 driver.get("https://www.amazon.in");
			    
			 driver.manage().window().maximize();
			 
			 String chord = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 
			 WebElement element = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			
			 // element.sendKeys(chord);
			 
			 String handle = driver.getWindowHandle();
             System.out.println(handle);
			
             Actions a = new Actions(driver);
			 a.contextClick(element).build().perform();Thread.sleep(1000); //right click
	       //a.click(element).build().perform();		
	       //a.moveToElement(element).build().perform();	//JUST PUT CURSSOR ON WEBELEMENT SHOW SUB CLASSES
		   //a.doubleClick(element).build().perform();
			
			 Robot r= new Robot();
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);
		
             Set<String> set = driver.getWindowHandles();
             for (String id : set) {
            	 String title = driver.switchTo().window(id).getTitle();
            	 System.out.println(title);
				
			}
		
		    String a1 ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		    
		    for (String id : set) {
		    	if(driver.switchTo().window(id).getTitle().equals(a1)) {
		    		continue;
		    }
			
		    	else {
		    		driver.close();
		    	}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}