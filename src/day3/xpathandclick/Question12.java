package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("https://www.snapdeal.com/");
		
		//Click signin button
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")).click();

		//Click register
		driver.findElement(By.linkText("LOGIN")).click();
		
		//Enter mobile number/email
		driver.findElement(By.id("userName")).sendKeys("9978976249");
		
		//Click button
		driver.findElement(By.id("checkUser")).click();
		
	}

}
