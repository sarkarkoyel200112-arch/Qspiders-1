package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameWebTechnology2 {
      public static void main(String[] args) throws Exception {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  driver.get("https://ui.vision/demo/webtest/frames/");
		  Thread.sleep(1000);
		  WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		  driver.switchTo().frame(frame1);

		  driver.findElement(By.name("mytext1")).sendKeys("Java");

		  driver.switchTo().defaultContent();
		  
		  WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		  driver.switchTo().frame(frame2);

		  driver.findElement(By.name("mytext2")).sendKeys("Selenium");

		  driver.switchTo().defaultContent();
		  
		  WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		  driver.switchTo().frame(frame3);

		  driver.findElement(By.name("mytext3")).sendKeys("API Testing-Postman");

		  driver.switchTo().defaultContent();
		  
		  WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		  driver.switchTo().frame(frame4);

		  driver.findElement(By.name("mytext4")).sendKeys("API Testing-Rest Assured");

		  driver.switchTo().defaultContent();
		  
		  WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		  driver.switchTo().frame(frame5);

		  driver.findElement(By.name("mytext5")).sendKeys("Playwright");

		  driver.switchTo().defaultContent();

		  
	}
}
