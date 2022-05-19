package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) {
		
		//Configuring browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		//Enter username
		driver.findElement(By.xpath("//*[@id=\"DUMMY1\"]")).sendKeys("kavi@gmail.com");
		
		//Enter password
		driver.findElement(By.xpath("//*[@id=\"DUMMY23\"]")).sendKeys("1234567890");
		
		//close window
		driver.close();
	
	}

}
