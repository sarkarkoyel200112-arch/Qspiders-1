package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSelfWorkMultilist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admirhodzic.github.io/multiselect-dropdown/demo.html");
		
		WebElement ele = driver.findElement(By.className("multiselect-dropdown"));
		
		
		
		Select sel = new Select(ele);
		
		sel.selectByContainsVisibleText("Audi");
		sel.selectByContainsVisibleText("BMW");
		sel.selectByContainsVisibleText("Mercedes");
		sel.selectByContainsVisibleText("Volvo");
		
		WebElement selClick = driver.findElement(By.xpath("//input[@type='checkbox']"));
		selClick.click();
		
		Thread.sleep(2000);
		
		sel.deselectAll();

	}

}
