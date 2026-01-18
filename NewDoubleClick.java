package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement ele = driver.findElement(By.id("dblclick"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
		WebElement ele1 = driver.findElement(By.id("rightclick"));
		act.moveToElement(ele1).contextClick().perform();

	}

}
