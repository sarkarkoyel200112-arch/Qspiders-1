package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStrokes {
     public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement ele = driver.findElement(By.name("user-name"));
		ele.sendKeys("standard_user",Keys.TAB,"secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
	}
}
