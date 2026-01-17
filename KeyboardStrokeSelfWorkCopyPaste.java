package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStrokeSelfWorkCopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement ele1 = driver.findElement(By.name("user-name"));
		ele1.sendKeys("standard_user",Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"c");
		WebElement ele2 = driver.findElement(By.name("password"));
		ele2.sendKeys(Keys.CONTROL+"v");
		ele2.sendKeys(Keys.TAB,Keys.ENTER);

	}

}
