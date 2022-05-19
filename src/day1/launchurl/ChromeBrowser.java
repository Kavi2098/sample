package day1.launchurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		//Configuring browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");

		//maximize
		driver.manage().window().maximize();
		
		//close
		driver.close();
		
	}

}
