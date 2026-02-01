package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("alertbox")).click();
		Alert ele = driver.switchTo().alert();
		ele.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("confirmalertbox")).click();
		Alert ele1 = driver.switchTo().alert();
		ele1.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		Alert ele2 = driver.switchTo().alert();
		ele2.sendKeys("yes");
		ele2.accept();
		

	}

}
