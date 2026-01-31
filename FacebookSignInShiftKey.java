package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookSignInShiftKey {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(email, "koyels229@gmail.com").keyUp(Keys.SHIFT).sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.SHIFT).sendKeys(password, "ks_oyel").keyUp(Keys.SHIFT).perform();

	}

}
