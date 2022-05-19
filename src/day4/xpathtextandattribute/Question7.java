package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {

	public static void main(String[] args) {

		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();

		//Launch url
		driver.get("http://www.google.com/");

		//maximize
		driver.manage().window().maximize();

		//Enter text in search box
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("greens velmurugan");

		//Click search btn
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		btn.click();

		//Click link
		WebElement link = driver.findElement(By.partialLinkText("Velmurugan K - Technical Manager"));
		link.click();

	}

}
