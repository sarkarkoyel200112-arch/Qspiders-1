package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QAPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qa-practice.netlify.app/double-click");
		
		WebElement ele = driver.findElement(By.id("double-click-btn"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).perform();

	}

}
