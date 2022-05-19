package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {

		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();

		//Launch url
		driver.get("http://greenstech.in/selenium-course-content.html");

		//maximize
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		//Click link text
		driver.findElement(By.linkText("Trainer")).click();

		//Print existing paragraph from web which starts with vel murugan (1)
		WebElement webText = driver.findElement(By.xpath("//*[@id=\"trainer\"]/div/div[1]/p[3]"));

		String text = webText.getText();
		System.out.println(text);

		//Print existing paragraph from web which starts with vel murugan (2)
		WebElement paraText = driver.findElement(By.xpath("//*[@id=\"trainer\"]/div/div[1]/p[4]"));

		String text1 = paraText.getText();
		System.out.println(text1);

	}

}
