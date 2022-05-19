package day5.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of Firefox driver
		WebDriver driver = new ChromeDriver();

		//Launching URL
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		//Maximize
		driver.manage().window().maximize();
		
		//Finding web element
		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement amount1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement debit = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement account2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement amount2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement credit = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		//Performing Drag and Drop actions
		Actions action = new Actions(driver);
		action.dragAndDrop(bank, account1).perform();
		action.dragAndDrop(amount1, debit).perform();
		action.dragAndDrop(sales, account2).perform();
		action.dragAndDrop(amount2, credit).perform();
	}

}
