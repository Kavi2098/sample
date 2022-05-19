package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("https://www.swiggy.com/");
		
		//Click signup
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]")).click();
				
		//Enter mobile number
		driver.findElement(By.id("mobile")).sendKeys("9978976249");
		
		//Enter name
		driver.findElement(By.id("name")).sendKeys("Kavi");
		
		//Enter email
		driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
				
		//Enter password
		driver.findElement(By.id("password")).sendKeys("72r3689io");
		
		//Click continue button
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/a")).click();
		
	}

}
