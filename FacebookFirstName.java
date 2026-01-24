package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookFirstName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.name("firstname"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(ele, "Koyel").perform();

	}

}
