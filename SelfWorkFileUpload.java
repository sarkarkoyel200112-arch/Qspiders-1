package day9;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfWorkFileUpload {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://easyupload.io/");
        
        Thread.sleep(1000);
        
        WebElement eleButton = driver.findElement(By.xpath("//span[@class='dz-button']"));
        eleButton.click();
        Thread.sleep(1000);
        
        Robot robo = new Robot();
        
        Thread.sleep(1000);
        for(int i = 1; i < 20; i++) {
        	robo.keyPress(KeyEvent.VK_TAB);
        	robo.keyRelease(KeyEvent.VK_TAB);
        	
        	
        }
        
        for(int i = 1; i < 26; i++) {
        	robo.keyPress(KeyEvent.VK_DOWN);
            robo.keyRelease(KeyEvent.VK_DOWN);
        }
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        
        for(int i = 1; i < 20; i++) {
        	robo.keyPress(KeyEvent.VK_UP);
        	robo.keyRelease(KeyEvent.VK_UP);
        }
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        
    }
}

