package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("http://greenstech.in/selenium-course-content.html");

		//Click Model Resumes
		driver.findElement(By.xpath("//*[@id=\"heading201\"]/h2")).click();

		//Click Resume 1
		driver.findElement(By.partialLinkText("Model-1")).click();

	}

}
