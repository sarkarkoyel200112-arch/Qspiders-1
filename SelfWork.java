package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement ele1 = driver.findElement(By.name("Email"));
		ele1.sendKeys("sarkarkoyel@gmail.com",Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"c");
		WebElement ele2 = driver.findElement(By.name("Password"));
		ele2.sendKeys(Keys.CONTROL+"v");
		ele2.sendKeys(Keys.TAB, Keys.ENTER);

	}

}
