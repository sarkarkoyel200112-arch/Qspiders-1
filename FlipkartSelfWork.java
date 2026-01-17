package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSelfWork {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		WebElement links = driver.findElement(By.linkText("Become a Seller"));
		
		links.click();
		
		Thread.sleep(1000);
		
		WebElement body = driver.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(1000);
		body.sendKeys(Keys.PAGE_UP);
		
		

	}

}
