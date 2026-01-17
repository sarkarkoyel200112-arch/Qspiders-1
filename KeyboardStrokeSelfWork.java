package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStrokeSelfWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		WebElement ele1 = driver.findElement(By.name("FirstName"));
		ele1.sendKeys("Koyel",Keys.TAB,"Sarkar",Keys.TAB,"sarkarkoyel200112@gmail.com");
		
		WebElement ele2 = driver.findElement(By.name("Password"));
		ele2.sendKeys("Ks_9arkar",Keys.TAB,"Ks_9arkar");
		
		driver.findElement(By.name("register-button")).click();

	}

}
