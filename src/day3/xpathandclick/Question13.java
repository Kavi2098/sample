package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question13 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		//Enter mobile number
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys("9978976249");
		
		//Click button
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]")).click();
		
	}

}
