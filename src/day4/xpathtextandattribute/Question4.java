package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) {
		
		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//maximize
		driver.manage().window().maximize();
		
		//Print existing text address from web
		WebElement webText = driver.findElement(By.xpath("/html/body/footer/div[1]/div[1]/div[2]"));
		
		String text = webText.getText();
		System.out.println(text);
		
		//close
		driver.close();
		
	}

}
