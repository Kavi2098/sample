package day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of Firefox driver
		WebDriver driver = new ChromeDriver();

		//Launching URL
		driver.get("http://www.amazon.in");

		//Maximize
		driver.manage().window().maximize();

		//Finding web element
		WebElement prime = driver.findElement(By.linkText("Prime"));

		//Performing mousehover actions
		Actions action = new Actions(driver);
		action.moveToElement(prime).perform();
		action.moveToElement(prime).click().build().perform();

		//close browser
		driver.close();
		
	}

}
