package day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartChildWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
	    
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone')]")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> childID = driver.getWindowHandles();
		childID.remove(parentID);
		
		for(String childElement : childID) {
			driver.switchTo().window(childElement);
			driver.findElement(By.xpath("//button[@class='dSM5Ub ugg2XR IUmgrZ']")).click();
		}
	}

}
