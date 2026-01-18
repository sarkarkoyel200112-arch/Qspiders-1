package day5;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Laptop");
		
		WebElement ele = driver.findElement(By.xpath("//input[@value='Search']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		
		

	}

}
