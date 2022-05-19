package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("https://www.facebook.com/");

		//Enter username
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kavi@gmail.com");

		//Enter password
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1235574898");

		//Click button
		driver.findElement(By.name("login")).click();

	}

}
