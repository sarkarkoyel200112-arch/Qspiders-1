package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		
		Thread.sleep(2000);
		driver.switchTo().frame("parent_iframe");
		
		driver.findElement(By.id("u_5_5")).click();
		
		driver.switchTo().frame("iframe1");
		
		driver.findElement(By.id("u_5_6")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[.='Selenium WebDriver with Java Automation Certification']")).click();

	}

}
