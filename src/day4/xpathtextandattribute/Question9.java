package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("https://www.snapdeal.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Search for product
		driver.findElement(By.id("inputValEnter")).sendKeys("shoes");
		
		//Click search btn
		WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span"));
		searchbtn.click();
		
		Thread.sleep(3000);
		
		//Click 1st product
		WebElement productbtn = driver.findElement(By.xpath("//*[@id=\"657472074991\"]/div[3]/div[1]/a/p"));
		productbtn.click();
		
	}

}
