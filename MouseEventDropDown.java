package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		Thread.sleep(1000);
		
		WebElement drag = driver.findElement(By.id("draggableElement"));
		WebElement drop = driver.findElement(By.id("droppableElement"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();

	}

}
