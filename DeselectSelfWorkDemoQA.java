package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSelfWorkDemoQA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select sel = new Select(ele);
		
		sel.selectByValue("volvo");
		sel.selectByValue("saab");
		sel.selectByValue("opel");
		sel.selectByValue("audi");
		
		Thread.sleep(2000);
		
		sel.deselectByIndex(2);
		sel.deselectByValue("saab");
		sel.deselectByVisibleText("Audi");
		sel.deSelectByContainsVisibleText("Vol");

	}

}
