package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("http://greenstech.in/selenium-course-content.html");

		//Click Interview questions
		driver.findElement(By.xpath("//*[@id=\"heading20\"]/h2")).click();

		//Click CTS interview button
		driver.findElement(By.xpath("//*[@id=\"collapse20\"]/div/div/ul/li[6]/a")).click();

	}

}
