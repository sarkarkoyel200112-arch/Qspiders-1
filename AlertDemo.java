package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
        
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert ele = driver.switchTo().alert();
		ele.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Alert ele1 = driver.switchTo().alert();
		ele1.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert ele2 = driver.switchTo().alert();
		ele2.sendKeys("Koyel Sarkar");
		ele2.accept();
	}

}
