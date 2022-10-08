package online;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver(); // Upcasting & dynamic
		    
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getPositionButton = driver.findElement(By.id("position"));
		
		//1. get the xy position
		Point xypoint=getPositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		
		System.out.println("X value is :"+xValue+"Y value is :"+yValue);
		
		//2.find the color
		
		WebElement colorButton=driver.findElement(By.id("color"));
		String color =colorButton.getCssValue("background-color");
		System.out.println("Button color is :"+color);
		
		//3. find the size
		
		WebElement sizeButton = driver.findElement(By.id("size"));
	    int height =sizeButton.getSize().getHeight();
	    int width =sizeButton.getSize().getWidth();
	    System.out.println("Height is :"+ height +"Width is :"+width);
	    
	    //4.go to home
	    
	    WebElement homebutton =driver.findElement(By.id("home"));
	    homebutton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}