package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("https://www.cleartrip.com/trains");

		//Enter "from" textbox
		driver.findElement(By.id("from_station")).sendKeys("Egmore");

		//Enter "to" textbox
		driver.findElement(By.id("to_station")).sendKeys("Arakkonam");
		
		//Click button
		driver.findElement(By.id("trainFormButton")).click();

	}

}
