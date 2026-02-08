package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDownload {
     public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='license-link icn-download-locked']")).click();
		WebElement buttonDownload = driver.findElement(By.xpath("//a[@class='download-file icn-download']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", buttonDownload);
		
	}
}
