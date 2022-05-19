package day2.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {

	public static void main(String[] args) {

		//Configuring browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("http://demo.automationtesting.in/Register.html");

		//Enter first name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Kavitha");

		//Enter last name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Ravichandran");

		//Enter address
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Porur");

		//Enter email
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("kavi@gmail.com");
		
		//Enter phone#
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7425709009");

		//close window
		driver.close();

	}

}
