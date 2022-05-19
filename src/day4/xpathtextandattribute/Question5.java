package day4.xpathtextandattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) {
		
		//Configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavitha\\Selenium Automation\\Selenium\\Drivers\\chromedriver.exe");
		
		//Creating instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("http://www.greenstechnologys.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Print existing text from web- starts with Greens Technology
		WebElement webText = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/p[2]"));
		
		String text = webText.getText();
		System.out.println(text);
		
		//close
		driver.close();
		
	}

}
