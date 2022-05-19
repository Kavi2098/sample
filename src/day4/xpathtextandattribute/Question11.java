package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11 {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("https://www.flipkart.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Enter username & print
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		username.sendKeys("kavi@gmail.com");
		
		String mailId = username.getAttribute("value");
		System.out.println(mailId);
		
		//Enter password & print
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys("187258vvvhiu");
		
		String pswd = password.getAttribute("value");
		System.out.println(pswd);
		
	}

}
