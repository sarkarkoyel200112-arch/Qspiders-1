package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollAmazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		
		
		
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1000).perform();
		Thread.sleep(1000);
		act.scrollByAmount(0, -1000).perform();
		
		WebElement button = driver.findElement(By.xpath("(//span[@class='nav-line-2' or text()='Cart'])[4]"));
		act.click(button).perform();
		WebElement ele = driver.findElement(By.linkText("Amazon Business Card"));
		act.scrollToElement(ele).perform();
		Thread.sleep(1000);
		act.click(ele).perform();
		WebElement eleLink = driver.findElement(By.partialLinkText("Sign in to apply"));
		act.scrollFromOrigin(ScrollOrigin.fromElement(eleLink), 0, 1600).perform();
		Thread.sleep(1000);
		act.scrollFromOrigin(ScrollOrigin.fromViewport(), 0, -1600).perform();

	}

}
