package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopMethod2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);

        

        WebElement pollOption = driver.findElement(By.id("pollanswers-2"));
        System.out.println(pollOption.getLocation());
        
        act.moveByOffset(1035, 455).click().perform();
    }
}
