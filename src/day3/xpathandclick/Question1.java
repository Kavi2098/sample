package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		
		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.amazon.in/");
		
		//Enter text in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		//Click button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
