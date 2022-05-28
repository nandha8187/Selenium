package selenium_Trainig;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	     
	     WebDriver driver =new ChromeDriver();           	
		
		 driver.get("http://www.leafground.com/pages/table.html");
		 
		 driver.manage().window().maximize();
	
		 List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));      //to get the data in the table
		
		 for (WebElement table : list) {
              System.out.println(table.getText());  			
		 }
		
	     System.out.println("-------------------------------------------------------------------");	
  		
		 List<WebElement> list1 = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));  //to get  data in row the table
		
		 for (WebElement table  : list1) {
			System.out.println(table.getText());
		 }
		
		 System.out.println("---------------------------------------------------------------------");
		
		 List<WebElement> list2 = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));  //to get  data in coulmn the table
		
		 for (WebElement table : list2) {
			System.out.println(table.getText());
			
		 }
		
		 System.out.println("--------------------------------------------------------------------------");
		
		 WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")); //to get particular data
		 System.out.println(particular.getText());
		
		 System.out.println("-----------------------------------------------------------------------------");
		
		 WebElement head = driver.findElement(By.tagName("th")); //to find header                     
		 System.out.println(head.getText());
		
	     System.out.println("----------------------------------------------------------------------");
             
	     WebElement sd = driver.findElement(By.name("vital"));	  
         sd.click();
         
               
             boolean d = sd.isSelected();
             System.out.println(d);
		
			}

}