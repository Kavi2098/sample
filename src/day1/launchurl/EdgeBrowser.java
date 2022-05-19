package day1.launchurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		//Configuring browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\msedgedriver.exe");
		
		//Creating instance of edge driver
		WebDriver driver = new EdgeDriver();
		
		//Launch url
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");

		//maximize
		driver.manage().window().maximize();
		
		//close
		driver.close();
		
	}

}
