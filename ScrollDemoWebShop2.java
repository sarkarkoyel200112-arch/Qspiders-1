package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollDemoWebShop2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.linkText("My account"));
		WebElement ele2 = driver.findElement(By.linkText("Computers"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(ele).perform();
		
       
	}

}
