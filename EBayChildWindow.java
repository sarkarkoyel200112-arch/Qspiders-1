package day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayChildWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone", Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 A2482 128 GB Midnight TracFone Excellent']")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> childID = driver.getWindowHandles();
		childID.remove(parentID);
		
		for(String childElement : childID) {
			driver.switchTo().window(childElement);
			driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]")).click();
			
		}

	}

}
