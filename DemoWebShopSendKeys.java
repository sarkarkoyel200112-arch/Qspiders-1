package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopSendKeys {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.id("small-searchterms"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().sendKeys("Laptop").build().perform();

	}

}
