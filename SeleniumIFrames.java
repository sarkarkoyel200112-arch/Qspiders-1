package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.selenium.dev/selenium/web/iframes.html");
		WebElement ele = driver.findElement(By.name("iframe1-name"));
		driver.switchTo().frame(ele);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("koyels586@gmail.com");
		driver.findElement(By.id("submitButton")).click();

	}

}
