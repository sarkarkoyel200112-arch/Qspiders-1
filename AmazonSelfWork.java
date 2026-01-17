package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelfWork {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.name("url"));
		ele.click();
		for(int i = 1; i <= 8; i++) {
			ele.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
		}
		ele.sendKeys(Keys.ENTER);

	}

}
