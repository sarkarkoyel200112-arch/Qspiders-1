package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectByIndex2 {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        // Wait for page to load
        Thread.sleep(3000);

        WebElement ele = driver.findElement(By.id("oldSelectMenu"));
        
        

        // No need to click before using Select
        Select sel = new Select(ele);
        System.out.println(sel.isMultiple());
    }
}
