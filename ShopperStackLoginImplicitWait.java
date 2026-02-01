package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackLoginImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/user-signin");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("koyels586@gmail.com");
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Ks_9arkar");
		
		WebElement loginButton = driver.findElement(By.id("Login"));
		loginButton.click();
		
		driver.quit();

	}

}
