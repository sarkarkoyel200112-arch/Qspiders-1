package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopShiftKey {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.name("NewsletterEmail"));
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(ele,"koyel").keyUp(Keys.SHIFT).perform();

	}

}
