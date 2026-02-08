package day9;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(1000);
		
		Robot robo = new Robot();
		
		Thread.sleep(1000);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyRelease(KeyEvent.VK_N);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
