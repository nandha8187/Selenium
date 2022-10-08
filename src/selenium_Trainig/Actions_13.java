package selenium_Trainig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
public class Actions_13 {

	public static void main(String[] args) throws AWTException, InterruptedException {
          // TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		    
		 WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		 driver.get("https://www.amazon.in");
		    
		 driver.manage().window().maximize();
		 
		 WebElement element = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		 
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
		 
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		
		a.contextClick(element2).build().perform();Thread.sleep(1000); //right click
      //a.click(element2).build().perform();		
      //a.moveToElement(element2).build().perform();	//JUST PUT CURSSOR ON WEBELEMENT SHOW SUB CLASSES
		
		 Robot r1= new Robot();
		 r1.keyPress(KeyEvent.VK_DOWN);
		 r1.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r1.keyPress(KeyEvent.VK_ENTER);
		 r1.keyRelease(KeyEvent.VK_ENTER);
		 
		
		WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		
		a.contextClick(element3).build().perform();Thread.sleep(1000); //right click
	  //a.click(element3).build().perform();		
	  //a.moveToElement(element3).build().perform();	//JUST PUT CURSSOR ON WEBELEMENT SHOW SUB CLASSES
		
		 Robot r2= new Robot();
		 r2.keyPress(KeyEvent.VK_DOWN);
		 r2.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r2.keyPress(KeyEvent.VK_ENTER);
		 r2.keyRelease(KeyEvent.VK_ENTER);
		 
		WebElement element4 = driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_bestsellers')]"));
		
		a.contextClick(element4).build().perform();Thread.sleep(1000); //right click
	  //a.click(element4).build().perform();		
	  //a.moveToElement(element4).build().perform();	//JUST PUT CURSSOR ON WEBELEMENT SHOW SUB CLASSES
		
		 Robot r3= new Robot();
		 r3.keyPress(KeyEvent.VK_DOWN);
		 r3.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 r3.keyPress(KeyEvent.VK_ENTER);
		 r3.keyRelease(KeyEvent.VK_ENTER);
		 
		//WebElement element5 = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		//a.moveToElement(element5).build().perform();
		String windowHandle = driver.getWindowHandle();  //it returs parent window
		Set<String> handles = driver.getWindowHandles();
		
		for (String id : handles) {
			
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			driver.switchTo().window(id);
			if(!id.equals(windowHandle)) {  //if current window is not a parent window if will close the window
				driver.close();
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}