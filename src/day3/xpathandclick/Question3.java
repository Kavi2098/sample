package day3.xpathandclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {

		//Configure Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");

		//Creating instance of chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//launch url
		driver.get("http://demo.automationtesting.in/Register.html");

		//Enter first name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Kavi");

		//Enter last name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Ravi");

		//Enter address
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("XYZ");
		
		//Enter email
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("123@gmail.com");
				
		//Enter phone#
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1234567890");
		
		//Enter gender
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		
		//Enter Hobbies
		driver.findElement(By.id("checkbox2")).click();

		//Enter password
		driver.findElement(By.id("firstpassword")).sendKeys("123461869");
		
		//Confirm password
		driver.findElement(By.id("secondpassword")).sendKeys("123461869");
		
		//Click button
		driver.findElement(By.id("submitbtn")).click();

	}

}
