package selenium_Trainig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Day_One1 {

        public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selenium_Concepts\\\\Driver\\\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
	    
	    driver.get("https://www.cricket.com");
	           
	    driver.manage().window().maximize();
	    
	    String title = driver.getTitle();
	    System.out.println(title);          
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    
	    driver.navigate().to("https://www.youtube.in");        
        driver.navigate().back();
	    
	    driver.navigate().forward();     
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(5000);  //No such Element Exception
	    
	    driver.close();
	    
       	   
	
	
}

}