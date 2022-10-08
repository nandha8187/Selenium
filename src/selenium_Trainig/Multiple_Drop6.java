package selenium_Trainig;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Drop6{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
		    
	     WebDriver driver =new ChromeDriver();           	
		
		 driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		 driver.manage().window().maximize();
	
         WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
         
         Select s =new Select(multi);
         
         s.selectByValue("1");
         s.selectByIndex(2);
         s.selectByVisibleText("UFT/QTP");
		 Thread.sleep(2000);
		
		 s.deselectByValue("1");
		   
		 
		 List<WebElement> options = s.getOptions();
		 ListIterator<WebElement> opt = options.listIterator();
		 while (opt.hasNext()) {
			WebElement next	 =  opt.next();
			System.out.println(next.getText());
			
		}
		 
		System.out.println("====================================");
	      	 
		List<WebElement> all = s.getAllSelectedOptions(); 
		ListIterator<WebElement> allop = all.listIterator();
		while (allop.hasNext()) {
			WebElement next = (WebElement) allop.next();
			System.out.println(next.getText());
			
		}
		 
		System.out.println("====================================");
		 
		WebElement fs = s.getFirstSelectedOption();
		System.out.println(fs.getText());
		 
		System.out.println("=================================="); 
		 
		boolean multiple = s.isMultiple();
		System.out.println("MULTIPLE OR NOT: "+multiple);
		 
		 
                                }

}