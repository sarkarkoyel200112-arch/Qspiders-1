package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonoBussinessLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
	    Thread.sleep(4000);
	    
	    driver.findElement(By.id("password")).sendKeys("45678");
	    Thread.sleep(3000);
	    WebElement ele = driver.findElement(By.xpath("//div[@class='addIcon']//button"));
	    Actions act = new Actions(driver);
	    act.moveToElement(ele).clickAndHold().perform();
	    Thread.sleep(1000);
	    act.moveToElement(ele).release().perform();
		
	}

}
