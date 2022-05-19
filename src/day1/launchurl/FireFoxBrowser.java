package day1.launchurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) {
		
		//Configuring browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\geckodriver.exe");
		
		//Creating instance of firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//Launch url
		driver.get("http://www.greenstechnologys.com");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in");
		driver.get("http://greenstech.in/selenium-course-content.html");

		//maximize
		driver.manage().window().maximize();
		
		//close
		driver.close();
		
	}

}
