package day4;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotKeyboard {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(1000);
		
		Robot robo = new Robot();
		for(int i = 1; i <= 11; i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		}
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_ENTER);

	}

}
