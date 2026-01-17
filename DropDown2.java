package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select sel = new Select(ele);
		
		sel.selectByValue("volvo");
		sel.selectByValue("saab");
		sel.selectByValue("opel");
		sel.selectByValue("audi");
		
		List<WebElement> ele2 = sel.getAllSelectedOptions();
		for(WebElement element : ele2) {
			System.out.println(element.getText());
			
			WebElement ele3 = sel.getFirstSelectedOption();
			System.out.println(ele3.getText());
		}
	}

}
