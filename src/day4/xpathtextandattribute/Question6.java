package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {

	public static void main(String[] args) {
		
		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("https://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Enter username
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kavi@gmail.com");
		
		//Enter password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234567890");
		
		//Print username & password
		String attribute1 = username.getAttribute("value");
		System.out.println(attribute1);
		
		String attribute2 = password.getAttribute("value");
		System.out.println(attribute2);
		
		//close
		driver.close();
		
	}

}
