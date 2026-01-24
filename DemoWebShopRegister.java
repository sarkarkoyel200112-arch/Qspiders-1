package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		WebElement eleFirstName = driver.findElement(By.id("FirstName"));
		
		Actions act = new Actions(driver);
		act.sendKeys(eleFirstName, "Koyel").perform();
		
		WebElement eleLastName = driver.findElement(By.id("LastName"));
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(eleLastName).click().sendKeys("Sarkar").build().perform();
		
		WebElement eleEmail = driver.findElement(By.id("Email"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(eleEmail).click().sendKeys("koyels229@gmail.com").build().perform();
		
		WebElement elePassword = driver.findElement(By.id("Password"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(elePassword).click().sendKeys("Ks_9arkar").build().perform();
		
		WebElement eleConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
		Actions act4 = new Actions(driver);
		act4.moveToElement(eleConfirmPassword).click().sendKeys("Ks_9arkar").build().perform();
		
		driver.findElement(By.id("register-button")).click();
	}

}
