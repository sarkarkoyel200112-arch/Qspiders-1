package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W3SchoolsDoubleClick {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-click me']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();

	}

}
