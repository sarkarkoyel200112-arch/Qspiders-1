package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShopMethod {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");

        Actions act = new Actions(driver);

        WebElement subscribeBtn = driver.findElement(By.id("newsletter-subscribe-button"));
        act.moveToElement(subscribeBtn).click().perform();

        WebElement pollOption = driver.findElement(By.id("pollanswers-2"));
        act.moveToElement(pollOption).click().perform();
    }
}
