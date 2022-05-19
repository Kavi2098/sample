package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//Enter first name
		driver.findElement(By.id("firstName")).sendKeys("Kavi");

		//Enter last name
		driver.findElement(By.id("lastName")).sendKeys("Ravi");
		
		//Enter username
		driver.findElement(By.name("Username")).sendKeys("kaviravi");
		
		//Enter password
		driver.findElement(By.name("Passwd")).sendKeys("1247t48889");
		
		//Enter confirm password
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("1247t48889");
		
		//check show password
		driver.findElement(By.id("i3")).click();
		
		//Click button
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
		
	}

}
