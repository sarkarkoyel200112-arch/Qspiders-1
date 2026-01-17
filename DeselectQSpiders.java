package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectQSpiders {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		
		Select sel = new Select(ele);
		
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		
		Thread.sleep(3000);
		sel.deselectAll();
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
