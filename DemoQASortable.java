package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQASortable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/sortable");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Grid']")).click();
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//div[@id='demo-tabpane-grid']//div[text()='One']"));
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='demo-tabpane-grid']//div[text()='Nine']"));
		Actions act = new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele1).perform();
		Thread.sleep(2000);
		act.release(ele1).perform();

	}

}
