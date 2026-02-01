package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ShopStackkerProductPage36FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.shoppersstack.com/products_page/36");
		
		WebElement checkDeliveryInput = driver.findElement(By.id("Check Delivery"));
		checkDeliveryInput.sendKeys("453331");
		WebElement checkButton = driver.findElement(By.id("Check"));
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();

	}

}
