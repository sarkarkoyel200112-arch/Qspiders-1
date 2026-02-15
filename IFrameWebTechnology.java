package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameWebTechnology {
      public static void main(String[] args) throws Exception {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  driver.get("https://ui.vision/demo/webtest/frames/");
		  driver.switchTo().frame(0);
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("mytext1")).sendKeys("Java");
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(1);
		  Thread.sleep(1000);
		  driver.findElement(By.name("mytext2")).sendKeys("Selenium");
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(2);
		  Thread.sleep(1000);
		  driver.findElement(By.name("mytext3")).sendKeys("Playwright");
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(3);
		  Thread.sleep(1000);
		  driver.findElement(By.name("mytext4")).sendKeys("API-Postman");
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(4);
		  Thread.sleep(1000);
		  driver.findElement(By.name("mytext5")).sendKeys("API-Rest Assured");
	}
}
