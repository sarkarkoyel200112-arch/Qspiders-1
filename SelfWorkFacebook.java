package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelfWorkFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement dayEle = driver.findElement(By.id("day"));
		
		WebElement monthEle = driver.findElement(By.id("month"));
		
		WebElement yearEle = driver.findElement(By.id("year"));
		
		Select selDay = new Select(dayEle);
		selDay.selectByValue("8");
		
		Select selMonth = new Select(monthEle);
		selMonth.selectByValue("4");
		
		Select selYear = new Select(yearEle);
		selYear.selectByValue("2025");

	}

}
