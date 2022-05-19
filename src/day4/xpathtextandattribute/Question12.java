package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12 {

	public static void main(String[] args) throws InterruptedException {
		
		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("https://www.shopclues.com/wholesale.html");
		
		//maximize
		driver.manage().window().maximize();
		
		//Search for product
		WebElement productSearch = driver.findElement(By.id("autocomplete"));
		productSearch.sendKeys("shoes", Keys.ENTER);
		
		//Click 1st product
		WebElement productbtn = driver.findElement(By.xpath("//*[@id=\"product_list\"]/div[2]/div[1]/a/h2"));
		productbtn.click();
		
	}

}
