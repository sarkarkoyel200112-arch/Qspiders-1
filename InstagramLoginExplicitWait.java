package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramLoginExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/");
		
		WebElement userNameInput = driver.findElement(By.name("email"));
		userNameInput.sendKeys("koyels586@gmail.com");
		WebElement passwordInput = driver.findElement(By.name("pass"));
		passwordInput.sendKeys("Ks_9arkar");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(loginButton));
		loginButton.click();

	}

}
