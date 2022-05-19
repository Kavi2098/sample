package day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Question3 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of Firefox driver
		WebDriver driver = new ChromeDriver();

		//Launching URL
		driver.get("http://www.flipkart.com");

		//Maximize
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		//Finding web element
		WebElement home = driver.findElement(By.linkText("Home"));

		//Performing mousehover actions
		Actions action = new Actions(driver);
		action.moveToElement(home).perform();
		
		WebElement bathLinen = driver.findElement(By.partialLinkText("Bath"));
		bathLinen.click();
		
		Select a = new Select(bathLinen);
		a.selectByVisibleText("Bath Towels");
		

		
	}

}
