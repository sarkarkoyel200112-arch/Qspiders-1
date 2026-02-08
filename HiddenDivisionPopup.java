package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("snd_6_14/02/2026")).click();

	}

}
