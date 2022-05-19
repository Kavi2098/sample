package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		
		//Configuring browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.facebook.com/");
		
		//Enter username
		driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
		
		//Enter password
		driver.findElement(By.id("pass")).sendKeys("12345678");
		
		//close window
		driver.close();
	
	}

}
